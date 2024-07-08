package DesignPatterns.SpringClient.Controllers;

import java.util.List;

import DesignPatterns.SpringClient.Data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("test")
public class TestDataControllers {

	@Autowired
	RestTemplate template;

	@GetMapping("/names/{count}")
	public List<String> getNames(@PathVariable Integer count) {
		return Data.getRandomName(count);
	}

	@PostMapping("/savename")
	public ResponseEntity<String> saveName(@RequestBody Name name) {
		System.out.println(name);
		ResponseEntity<String> entity2 = new ResponseEntity<String>("Saved", HttpStatus.CREATED);
		return entity2;
	}

}

record Name(String name) {
}
