package com.xc.security.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class HelloController {
	//登陆成功界面
	@RequestMapping(value={"/welcome","/"},method=RequestMethod.GET)
	public String Welcome(){
		return "login_wel";
	}
	
}
