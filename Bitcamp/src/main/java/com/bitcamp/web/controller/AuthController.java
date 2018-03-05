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
	@Autowired ContextFactory factory;
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model) {
		logger.info("AuthController login( {}","들어옴");
		//model.addAttribute("path", factory.path());
		return "public:user/login.tiles";  //퍼플릭.타일즈걸면 유저에 로그인으로 가는게 아니라. 레이아웃jsp로 가는데. 
	}
	
}
