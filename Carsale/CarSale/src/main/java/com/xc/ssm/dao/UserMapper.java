package com.xc.ssm.dao;


import com.xc.ssm.entity.User;
import com.xc.ssm.entity.UserSecurity;

public interface UserMapper {

    int insert(User record);

    int insertQX(UserSecurity record);

    
}