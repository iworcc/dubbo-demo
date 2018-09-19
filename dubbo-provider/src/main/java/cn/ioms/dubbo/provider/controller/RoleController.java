package cn.ioms.dubbo.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ioms.dubbo.service.RoleService;

@Controller
@RequestMapping(value = "/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = "role")
	@ResponseBody
	public String role() {
		System.out.println("controller");
//		return roleService.save()+"次";
		return "";
	}
}
