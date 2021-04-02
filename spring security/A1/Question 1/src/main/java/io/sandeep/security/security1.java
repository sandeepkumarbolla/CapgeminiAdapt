package io.sandeep.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class security1 {
@RequestMapping("/")
public String hello() {
	return "<h1>Hello ur logged in successfully<h1>";
}
}
