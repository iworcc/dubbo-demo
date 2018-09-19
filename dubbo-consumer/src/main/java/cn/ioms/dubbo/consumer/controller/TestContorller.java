package cn.ioms.dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ioms.dubbo.service.UserService;

@Controller
@RequestMapping(value = "/test")
public class TestContorller {

	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "sd")
	@ResponseBody
	public String sd() throws Exception{
		userService.findAll();
		return "sdsds";
	}
}
