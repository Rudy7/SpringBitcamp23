package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.web.factory.ContextFactory;


@Controller
public class AuthController {
	
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired ContextFactory contextFactory;
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model) {
		logger.info("AuthController login( {}","들어옴");
		model.addAttribute("context", contextFactory.create());
		model.addAttribute("js", contextFactory.path("js"));
		return "user/login";
	}
	
}
