package io.sandeep.restassign;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService us;
	
	@RequestMapping(value = "/pass", method=RequestMethod.POST)
	public String setPass(@RequestBody User u){
		return us.setPass(u);
	}
	

}