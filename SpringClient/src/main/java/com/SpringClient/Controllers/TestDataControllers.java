package com.SpringClient.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringClient.Data.Data;

@RestController
@RequestMapping("test")
public class TestDataControllers {

	@GetMapping("/names")
	public List<String> getNames() {
		return Data.getRandomName(10);
	}
}
