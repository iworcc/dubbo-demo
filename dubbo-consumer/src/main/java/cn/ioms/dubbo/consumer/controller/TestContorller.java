package cn.ioms.dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ioms.dubbo.service.UserService;
import cn.ioms.dubbo.service.activemq.ProviderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@RequestMapping(value = "/test")
@Api(value = "/test",tags = "test测试接口")
public class TestContorller {

	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProviderService providerService;
	
	@RequestMapping(value = "sd",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "获取所有用户信息", notes = "获取所有用户信息", httpMethod = "GET", response = String.class)
	public String sd() throws Exception{
		userService.findAll();
		return "sdsds";
	}
	
	
	@RequestMapping(value = "message",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Activemq生产者发送消息", notes = "Activemq生产者发送消息", httpMethod = "GET", response = String.class)
	public String message(String msg) {
		providerService.sendMessage(msg);
		return msg;
	}
	
	
}
