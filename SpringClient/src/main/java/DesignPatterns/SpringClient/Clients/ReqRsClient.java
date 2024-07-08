package DesignPatterns.SpringClient.Clients;

import java.net.URI;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReqRsClient {
	
	private String host="http://reqres.in/";
	
	@Autowired
	private RestTemplate sbRestTemplate;
	
	public String getReq() {
		String path=host+"api/users?page=2";
		System.out.println(path);
		Object body = sbRestTemplate.getForEntity(path, String.class, Map.of()).getBody();
		System.out.println(body);
		return body.toString();
	}
	
	public String postReq() {
		String path=host+"api/users";
		System.out.println(path);
		String payLoad="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		URI postForLocation = sbRestTemplate.postForLocation(path, payLoad);
		System.out.println(postForLocation);
		return ""; 
	}
	
}
