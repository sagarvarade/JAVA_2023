package com.SpringClient.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringClient.Clients.SBAppClient;

@RestController
@RequestMapping("resttemplate")
public class TestRestTemplate {

	@Autowired
	SBAppClient sbappClient;

	@GetMapping("/getall")
	public String getAllStd() {
		return sbappClient.getAllStudents();
	}
	
	@GetMapping("/getbyCount/{count}")
	public String getByCount(@PathVariable Integer count) {
		return sbappClient.getByCount(count);
	}
	
}
