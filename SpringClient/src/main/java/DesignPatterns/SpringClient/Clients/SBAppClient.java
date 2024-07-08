package DesignPatterns.SpringClient.Clients;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SBAppClient {

	private final String path = "/student/getall";
	private final String pathGetByCount = "/student/getstudent/";
	private final String saveStudent = "/student/save";
	
	@Value("${sbapp.path}")
	private String host;

	private RestTemplate sbRestTemplate;

	public SBAppClient(RestTemplateBuilder sbRestTemplate) {
		this.sbRestTemplate = sbRestTemplate.build();
	}

	public String getHost() {
		return host;
	}

	public String getAllStudents() {
		System.out.println(host+"   "+path);
		ResponseEntity<String> forEntity = sbRestTemplate.getForEntity(host + path, String.class, Map.of());
		System.out.println(forEntity.getBody());
		return forEntity.getBody();
	}
	 
	public String getByCount(Integer count) {
		String path=host + pathGetByCount+count;
		System.out.println(path);
		ResponseEntity<String> forEntity = sbRestTemplate.getForEntity(path, String.class, Map.of());
		System.out.println(forEntity.getBody());
		return forEntity.getBody();
	}
	

}
