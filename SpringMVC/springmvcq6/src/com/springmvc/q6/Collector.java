package com.springmvc.q6;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Collector {
	
	@RequestMapping(value = "/m", method = RequestMethod.GET)
	public ModelAndView getValues(@Valid @ModelAttribute("e") Employee e, BindingResult br) {
		if(br.hasErrors()) {
			ModelAndView mv = new ModelAndView("addandedit");
			return mv;
    }
		
		ModelAndView mv = new ModelAndView("success");
		return mv;
	}
}
