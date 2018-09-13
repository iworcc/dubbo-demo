package cn.ioms.dubbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/provider")
public class ProviderController {

	
	
	@RequestMapping("/sout")
	@ResponseBody
	public String sout1() {
		return "sdsds";
	}
}
