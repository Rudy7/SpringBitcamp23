package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class PathDTO {
	private String context,js,img,css;
	
}
