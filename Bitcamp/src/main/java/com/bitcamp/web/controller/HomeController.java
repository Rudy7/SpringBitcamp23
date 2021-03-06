package com.bitcamp.web.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.web.factory.ContextFactory;

@Controller
public class HomeController { //어떤한 것도 상속받지 않는 클래스 = 
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory contextFactory; 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("serverTime", new SimpleDateFormat("yyyy-MM-dd a hh:mm").format(new Date()) );
		model.addAttribute("context", (String) contextFactory.create());   // @Autowired ContextFactory contextFactory;걸 위에적고, 아래를 이렇게 해주는식으로 객체를만든다.객체만들기
																		   //이게 모델2면 맞는다. 하지만 여기는 모델2가 아니다. 
												                           //cf.create(); 빨간줄 있다. 캐스팅 해야한다. 여러군데서 쓰려고 위에서 오브젝트로 만들었다. 이렇게 광범위하게 잡는걸  ""라고 한다. 
		return "index";
	}
	@RequestMapping(value="/home", method=RequestMethod.GET)  //enum이넘에서 .GET식으로 사용했고, .GET는 상수이다. 
	public String home(Model model) {
		//Logger.info(" Move To {} ", "main/home")
		model.addAttribute("context", (String) contextFactory.create());
		model.addAttribute("js",contextFactory.path("js"));
		model.addAttribute("css",contextFactory.path("css"));
		model.addAttribute("img",contextFactory.path("img"));
		return "main/home";
	}
}
