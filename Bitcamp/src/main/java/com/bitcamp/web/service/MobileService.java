package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface MobileService {

	public ResultMap openingNum(Command cmd);

	/*MemberBean findMobileById(String id);*/
	
	public ResultMap findMobileById(Command cmd);
}
