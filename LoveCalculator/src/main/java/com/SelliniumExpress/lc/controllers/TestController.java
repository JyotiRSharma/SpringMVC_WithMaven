package com.SelliniumExpress.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@ResponseBody
	@RequestMapping(path = "/hello")
	public String sayHello() {
		return "TestController works!";
	}
}
