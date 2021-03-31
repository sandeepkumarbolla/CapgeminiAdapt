package io.sandeep.rest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Assign {
	
	@Autowired
	private AssignService assignService;
	
	
	@RequestMapping("/details/{id}")
	public AssignModel displayDetails(@PathVariable String id)
	{
		return assignService.getDetails(id);
		
		
	}


}
