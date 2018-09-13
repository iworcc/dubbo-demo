package cn.ioms.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ioms.dubbo.service.ProviderService;

@Controller
@RequestMapping(value = "/consumer")
public class ConsumerController {

	@Autowired
	private ProviderService providerService;
	
	@RequestMapping(value="sout")
	@ResponseBody
	public String sout() {
		providerService.provider();
		System.out.println("---1222-212");
		return "sdsdsdffff";
	}
	
	@RequestMapping(value="hw")
	@ResponseBody
	public String hw() {
		return providerService.helloWorld("   哈哈哈啊哈哈哈");
	}
	
}
