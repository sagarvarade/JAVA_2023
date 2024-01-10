package com.SBApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SBApplication.Beans.PropValues;

@RestController
@RequestMapping("helloworld")
public class HelloWorld {

	@Autowired
	private PropValues propValues;
	
	@GetMapping("/hello")
	public String getHello()
	{
		return "Hello";
	}

	@RequestMapping(method = RequestMethod.GET,value = "getpropvalues")
	public String getPropValues() {
		System.out.println(propValues.getName()+"  "+propValues.getSurname());
		return propValues.toString();
	}
}
