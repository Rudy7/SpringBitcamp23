package com.bitcamp.web.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bitcamp.web.controller.HomeController;
@Component
public class ContextFactory extends Factory{ // 익스텐즈할때 ContextFactory에 빨간줄이 생기면 무조건 추상이다. 
                                             // new 를 하려면 의미가 없어진다.  인터페이승는 상속구조를 쓸 수 없어서 추팩구조를 짜야한다. 
	                                         // 모바일이 더 빠른이유, 유선이 빠른데.  왜 스마트폰이 더 빠른가?  패턴의 차이이다. 보안이 필요없어서. 하놈으로 만들었다. 확장자 xml 
	private static final Logger logger = LoggerFactory.getLogger(ContextFactory.class);
	@Override
	public Object create() {
		
		return ((ServletRequestAttributes)
				RequestContextHolder
				.currentRequestAttributes())
				.getRequest()
				.getContextPath()
				;
	} 
	public String path(String tag) {
//		logger.info("ContextFactory path()에 넘어온 tag 값은 {} 이다"
//				,tag);
//		String path = "/resources/";
//		switch (tag) {
//		case "js":
//			path += "js";
//			break;
//		case "css":
//			path += "css";
//			break;
//		case "img":
//			path += "img";
//			break;
//		default:
//			break;
//		}
		logger.info("ContextFactory path()에 리턴되는 경로 값은 {} 이다"
				,create()+"");
		return  create()+"/resources/"+tag;
	}
}
