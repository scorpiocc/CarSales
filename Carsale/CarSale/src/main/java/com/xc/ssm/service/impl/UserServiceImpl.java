package com.xc.ssm.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xc.ssm.dao.UserMapper;
import com.xc.ssm.entity.User;
import com.xc.ssm.entity.UserSecurity;
import com.xc.ssm.service.UserService;

/**
 * 注入方式一般有两种，一种是按类型注入：@Resource，还有一种按名称注入@Autowired
 * 使用中注入可以属性属性注入，也可以方法注入
 * @author Scorpiocc
 *
 */
@Service
public class UserServiceImpl implements UserService{
	private UserMapper userMapper;
	@Resource
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public int addUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int addUserQX(UserSecurity userSecurity) {
		return userMapper.insertQX(userSecurity);
	}
	
	
	
	

}
