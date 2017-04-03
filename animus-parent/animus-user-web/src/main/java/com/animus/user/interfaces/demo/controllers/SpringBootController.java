package com.animus.user.interfaces.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/demo")
public class SpringBootController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getReq() {
		return "demo/index";
	}
}
