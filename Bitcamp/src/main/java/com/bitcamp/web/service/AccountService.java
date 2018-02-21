package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface AccountService {

	public ResultMap openAccount(Command cmd);

	public ResultMap findAccountById(Command cmd);

	public ResultMap findMobileById(Command cmd);
	
	public ResultMap findKakaoById(Command cmd);
}
