package com.xc.ssm.service;

import com.xc.ssm.entity.User;
import com.xc.ssm.entity.UserSecurity;

public interface StudentService {
	//增加用户
	int addUser(User user);
	//增加用户权限
	int addUserQX(UserSecurity userSecurity);
	
}
