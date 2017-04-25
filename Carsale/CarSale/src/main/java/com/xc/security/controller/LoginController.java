package com.xc.security.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
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
	@RequestMapping(value = "registerTo", method = RequestMethod.POST)
	public String registerTo(@RequestParam String username,@RequestParam String password, HttpServletRequest request){
		System.out.println(username);
		System.out.println(password);
		return "newLogin";
	}
	
	
}
