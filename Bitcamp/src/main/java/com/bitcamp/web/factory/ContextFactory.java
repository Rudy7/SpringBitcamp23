package com.bitcamp.web.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.bitcamp.web.domain.PathDTO;
import com.bitcamp.web.enums.Path;

@Component
public class ContextFactory extends Factory{ // 익스텐즈할때 ContextFactory에 빨간줄이 생기면 무조건 추상이다. 
                                             // new 를 하려면 의미가 없어진다.  인터페이승는 상속구조를 쓸 수 없어서 추팩구조를 짜야한다. 
	                                         // 모바일이 더 빠른이유, 유선이 빠른데.  왜 스마트폰이 더 빠른가?  패턴의 차이이다. 보안이 필요없어서. 하놈으로 만들었다. 확장자 xml 
	private static final Logger logger = LoggerFactory.getLogger(ContextFactory.class);
	
	@Autowired PathDTO path;
	@Override
	public Object create() {
		
		return ((ServletRequestAttributes)
				RequestContextHolder
				.currentRequestAttributes())
				.getRequest()
				.getContextPath()
				;
	} 
	public PathDTO path() {
		logger.info("ContextFactory path()에 리턴되는 경로 값은 {} 이다"
				,create()+"");
		
		path.setContext((String)create());
		path.setCss(create()+Path.CSS.toString());
		path.setJs(create()+Path.JS.toString());
		path.setImg(create()+Path.IMG.toString());
		return path ;
	}
}
