package io.springmvc.q2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleIntrestController {
	
	@RequestMapping(value = "/mani",method = RequestMethod.GET)
	public ModelAndView getValues(){
		
		ModelAndView mv =new ModelAndView("simpleInterest");
		mv.addObject("boy","sandeep kumar bolla");
		return mv;
	}
	
	@RequestMapping(value = "/Submit",method = RequestMethod.POST)
	public ModelAndView submitValue(@ModelAttribute("si") SimpleIntrest si) {
		ModelAndView mv =new ModelAndView("simpleInterestprint");
		return mv;
	}

}
