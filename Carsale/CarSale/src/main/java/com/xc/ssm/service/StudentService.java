package com.xc.ssm.service;

import java.util.List;

import com.xc.ssm.entity.User;

public interface StudentService {
	public List<User> queryAllStudent();
	
	public User queryStudentBySid(int id);
}
