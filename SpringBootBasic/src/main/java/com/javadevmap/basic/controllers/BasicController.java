package com.javadevmap.basic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringBoot")
public class BasicController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "***********Hello Spring Boot******************";
	}
}
