package io.springmvc.q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController1{
	
	   @RequestMapping(value ="/a/{bingoo}")
	   public ModelAndView firstMethod(@PathVariable("bingoo") String s){
				
		    ModelAndView mvv= new ModelAndView("helloWorld");
			mvv.addObject("man","sandeep");
			return mvv;	
	   }

}
