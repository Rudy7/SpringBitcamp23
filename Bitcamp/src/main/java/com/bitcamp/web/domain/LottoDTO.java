package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LottoDTO {
	private String randomNum,  // 하나 3
	lottoNumber,  // 한줄 3, 6, 16, 13, 23, 45
	money,  // 돈 5000
	count;	// 횟수
	@Override
	public String toString() {
		return "\n"+lottoNumber;
	}
	
}
