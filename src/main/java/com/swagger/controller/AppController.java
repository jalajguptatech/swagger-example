package com.swagger.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {
	@RequestMapping("/{name}")
	public String getName(@PathVariable("name") String name)
	{
		return name;
	}
	

}
