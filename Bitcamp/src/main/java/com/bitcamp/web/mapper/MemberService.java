package com.bitcamp.web.mapper;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface MemberService {

	public ResultMap insertMember(Command cmd);
	public ResultMap selectMemberById(Command cmd);
	public ResultMap login(Command cmd);
	public ResultMap deleteMember(Command cmd);
	
	public ResultMap changePass(Command cmd);
	public ResultMap newPass_update(Command cmd);
	public ResultMap nowIdDelete(Command cmd);
	public ResultMap memberInfo(Command cmd);

}

