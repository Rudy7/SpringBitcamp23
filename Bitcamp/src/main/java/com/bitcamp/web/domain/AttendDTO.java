package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AttendDTO {
	private String id, week, status;
	
}
