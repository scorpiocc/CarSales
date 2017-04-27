package com.xc.ssm.service.impl;



import org.springframework.stereotype.Service;

import com.xc.ssm.dao.UserMapper;
import com.xc.ssm.entity.User;
import com.xc.ssm.entity.UserSecurity;
import com.xc.ssm.service.StudentService;

/**
 * 注入方式一般有两种，一种是按类型注入：@Resource，还有一种按名称注入@Autowired
 * 使用中注入可以属性属性注入，也可以方法注入
 * @author Scorpiocc
 *
 */
@Service
public class StudentServiceImpl implements StudentService{
	private UserMapper userMapper;

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addUserQX(UserSecurity userSecurity) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
