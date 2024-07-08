package DesignPatterns.SpringClient.Controllers;

import DesignPatterns.SpringClient.Clients.ReqRsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("res")
public class TestResQTemplate {

	@Autowired
    ReqRsClient reqRsClient;
	
	@GetMapping("/getusers")
	public String getUsers() {
		return reqRsClient.getReq();
	}
	
	@GetMapping("/testpost")
	public String testpost() {
		return reqRsClient.postReq();
	}
	
}
