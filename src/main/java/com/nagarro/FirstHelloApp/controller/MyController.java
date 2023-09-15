package com.nagarro.FirstHelloApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class MyController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello() {

		return "hello";
	}

}
