package cn.ioms.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ioms.dubbo.entity.User;
import cn.ioms.dubbo.service.UserService;

@Controller
@RequestMapping(value = "/provider")
public class ProviderController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/sout")
	@ResponseBody
	public String sout1() throws Exception {
		User user = new User();
		user.setId(Long.valueOf("12312312313"));
		user.setUsername("嘎哈1");
		user.setPassword("1223");
		userService.insertSelective(user);
		return "sdsds";
	}
}
