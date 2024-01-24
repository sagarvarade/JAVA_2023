package com.SpringClient.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringClient.Clients.ReqRsClient;

@RestController
@RequestMapping("res")
public class TestResQTemplate {

	@Autowired
	ReqRsClient reqRsClient;
	
	@GetMapping("/getusers")
	public String getUsers() {
		return reqRsClient.getReq();
	}
	
}
