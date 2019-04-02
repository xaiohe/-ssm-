package com.ssm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.service.IUserService;
import com.ssm.util.SpringContextAware;

@Controller
@RequestMapping("/user")
public class UserController {

	//@Resource(name="userService")
	private IUserService userService;
	//private IUserService userService = (IUserService) SpringContextAware.applicationContext.getBean("userService");
	
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView view = new ModelAndView("index");
		userService.addUser();
		return view;//默认内部跳转
	}
	
}
