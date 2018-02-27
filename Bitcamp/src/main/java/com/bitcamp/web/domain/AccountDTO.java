package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AccountDTO {
	private String customNum, money, accountNum, id;

	@Override
	public String toString() {
		return "계좌번호 [고객번호=" + customNum
						+ ", 계좌번호= + accountNum"
						+ ", 잔액=" + money
						+ ", 고객ID=" + id +"]";
		//aad
	}	
	
}

