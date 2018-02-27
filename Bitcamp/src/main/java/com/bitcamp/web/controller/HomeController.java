package com.bitcamp.web.controller;

import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.bitcamp.web.factory.ContextFactory;


@Controller
@SessionAttributes("path")
public class HomeController { //어떤한 것도 상속받지 않는 클래스 = 
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory factory; 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);		
		model.addAttribute("path", factory.path());
		return "index";												//model.addAttribute("path",contextFactory.path("fonts"));  
																	// @Autowired ContextFactory contextFactory;걸 위에적고, 아래를 이렇게 해주는식으로 객체를만든다.객체만들기
																	// 이게 모델2면 맞는다. 하지만 여기는 모델2가 아니다. 
												                    // cf.create(); 빨간줄 있다. 캐스팅 해야한다. 여러군데서 쓰려고 위에서 오브젝트로 만들었다.  
	}
	@RequestMapping(value="/home", method=RequestMethod.GET)        // enum이넘에서 내장되어있다 .GET식으로 사용했고, .GET는 상수이다. method=RequestMethod.GET 겟만 할떄는 생략가능
	public String home(Model model) {
		logger.info(" Move To {} ", "main/home");
		return "public:main/home.tiles";
	}

}







