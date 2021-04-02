package io.sandeep.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class security1 {
@RequestMapping("/all")
public String hello() {
	return "<h1>Hello<h1>";
}
@RequestMapping("/user")
public String user(){
	return "welcome user";
}
@RequestMapping("/admin")
public String admin(){
	return "welcome admin";
}
}
