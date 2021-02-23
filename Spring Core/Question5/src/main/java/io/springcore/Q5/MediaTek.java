package io.springcore.Q5;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class MediaTek implements Processors {
	public void process() {
		System.out.println("I am not a great processor\n I am used in budget mobiles");
	}
}
