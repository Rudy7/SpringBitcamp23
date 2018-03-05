package com.bitcamp.web.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.factory.ContextFactory;
import com.bitcamp.web.service.LottoService;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired ContextFactory factory;
	@Autowired LottoService service;
	@Autowired LottoDTO lotto;
	
	@RequestMapping(value="/mypage", method=RequestMethod.GET)
	public String mypage(Model model) {
		logger.info("UserController mypage() {}","들어옴");
		model.addAttribute("path", factory.path());
		return "public:user/mypage.tiles";
	}
	@RequestMapping(value="/nav", method=RequestMethod.GET)
	public String nav(Model model) {
		logger.info("UserController nav() {}","들어옴");
		model.addAttribute("path", factory.path());
		return "public:common/nav.tiles";
	}
	@RequestMapping(value="/lotto/main", method=RequestMethod.GET)
	public String lottoMain(Model model) {
		logger.info("UserController lottoMain() {}","들어옴");
		model.addAttribute("path", factory.path());
		return "public:lotto/main.tiles";
	}
	@RequestMapping(value="/burger/main", method=RequestMethod.GET)
	public String burgerMain() {
		logger.info("UserController burgerMain() {}","들어옴");
		return "public:burgerking/main.tiles";
	}
	@RequestMapping(value="/lotto/{money}", method=RequestMethod.GET)
	public String lotto(@PathVariable String money,
			Model model) {
		logger.info("UserController lotto() {}","들어옴");
		logger.info(" Money is {} ", money);
		lotto.setMoney(money);
		List<LottoDTO> lottos = service.createLottos(lotto);
		logger.info(" 로또번호는 {} ", lottos);
		model.addAttribute("lottos",lottos);
		model.addAttribute("money",money);
		return "public:lotto/result.tiles";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
