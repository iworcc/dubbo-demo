package cn.ioms.dubbo.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ioms.dubbo.entity.User;
import cn.ioms.dubbo.service.UserService;

@Controller
@RequestMapping(value = "/test")
public class UserContorller {

	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "test")
	@ResponseBody
	public String test() throws Exception {
		
		List<User> list = userService.findAll();
		return "ok";
	}
	
	@RequestMapping(value = "update")
	@ResponseBody
	public String update() throws Exception {
		User us = new User();
		us.setId(Long.valueOf("2312312313"));
		us.setUsername("了略");
		userService.updateByPrimaryKeySelective(us);
		return "ok";
	}
}
