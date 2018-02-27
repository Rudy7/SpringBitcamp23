package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.web.factory.ContextFactory;
import com.sun.xml.internal.bind.CycleRecoverable.Context;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired ContextFactory factory;
	@RequestMapping(value="/mypage", method=RequestMethod.GET)
	public String mypage(Model model) {
		logger.info("UserController mypage() {}","들어옴");
		model.addAttribute("path", factory.path());
		return "user/mypage";
	}
	@RequestMapping(value="/nav", method=RequestMethod.GET)
	public String nav(Model model) {
		logger.info("UserController nav() {}","들어옴");
		model.addAttribute("path", factory.path());
		return "common/nav";
	}
	@RequestMapping(value="/lotto/main", method=RequestMethod.GET)
	public String lottoMain(Model model) {
		logger.info("UserController lottoMain() {}","들어옴");
		model.addAttribute("path", factory.path());
		return "lotto/main";
	}
	@RequestMapping(value="/burger/main", method=RequestMethod.GET)
	public String burgerMain(Model model) {
		logger.info("UserController burgerMain() {}","들어옴");
		model.addAttribute("path", factory.path());
		return "burgerking/main";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
