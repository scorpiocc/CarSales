package com.xc.security.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xc.ssm.entity.User;
import com.xc.ssm.entity.UserSecurity;
import com.xc.ssm.service.UserService;

@Controller
public class LoginController {
	/*@Resource
	private UserService userservice;*/
	
	//登陆界面  和登陆失败界面
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String loginPage(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            return "login-failure";
        }
        return "newLogin";
    }
	//跳转注册
	@RequestMapping(value="/register")
	public String register(){
		return "register";
	}
	
	//执行注册 (获取值)
	/*@RequestMapping(value = "registerTo", method = RequestMethod.POST)
	public String registerTo(@RequestParam String username,@RequestParam String password, HttpServletRequest request){
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEnabled(1);
		userservice.addUser(user);
		UserSecurity userS = new UserSecurity();
		userS.setUsername(username);
		userS.setAuthority("ROLE_USER");
		userservice.addUserQX(userS);
		return "register_wel";
	}*/
	
	
}
