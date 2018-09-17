package cn.ioms.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ioms.dubbo.entity.User;
import cn.ioms.dubbo.service.ProviderService;
import cn.ioms.dubbo.service.UserService;

@Controller
@RequestMapping(value = "/consumer")
public class ConsumerController {

	@Autowired
	private ProviderService providerService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="hw")
	@ResponseBody
	public String hw() throws Exception {
		User user = new User();
		user.setId(Long.valueOf("2312312313"));
		user.setUsername("嘎哈");
		user.setPassword("123");
		int num = userService.insertSelective(user);
		System.out.println(num+"------------");
//		int i = 1/0;
		return "";
	}
	
}
