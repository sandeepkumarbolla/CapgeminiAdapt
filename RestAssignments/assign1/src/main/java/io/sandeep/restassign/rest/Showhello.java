package io.sandeep.restassign.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Showhello {

	@RequestMapping("/hi")
	public String helloWorld() {
		return "Hello World";
	}
	
	
}
