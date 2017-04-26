package com.xc.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.ssm.dao.UserMapper;
import com.xc.ssm.entity.User;
import com.xc.ssm.service.StudentService;

/**
 * 注入方式一般有两种，一种是按类型注入：@Resource，还有一种按名称注入@Autowired
 * 使用中注入可以属性属性注入，也可以方法注入
 * @author Dazhong Zhou
 *
 */
@Service
public class StudentServiceImpl implements StudentService{
	private UserMapper studentMapper;
	@Resource
	public void setStudentMapper(UserMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	
	@Override
	public List<User> queryAllStudent() {
		return studentMapper.selectStudents();
	}

	@Override
	public User queryStudentBySid(int id) {
		return studentMapper.selectByPrimaryKey(id);
	}

}
