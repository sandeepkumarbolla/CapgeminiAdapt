package com.springmvc.q3;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value = "/mani",method = RequestMethod.GET)
	public ModelAndView getValues(){
		
		System.out.print("manikant");
		
		ModelAndView mv =new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value = "/Submit",method = RequestMethod.POST)
	public ModelAndView submitValue(@ModelAttribute("si") User si) {
		
		ArrayList<User> ll = Connectdb.getDetails();
		
		System.out.println(ll);
		
		for(User u:ll) {
			
			if(!u.equals(si)) {
				ModelAndView mv =new ModelAndView("success");
				return mv;
				
			}
		}
		
		
		ModelAndView mv =new ModelAndView("error");
		return mv;
	}

}
