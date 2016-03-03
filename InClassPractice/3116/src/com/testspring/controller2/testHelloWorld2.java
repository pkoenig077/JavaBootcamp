package com.testspring.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class testHelloWorld2 {


	@RequestMapping("/welcome2")
	public ModelAndView helloWorld2(@RequestParam("name")String name) {
		String [] ar = new String [2];
		ar[0] = "Hello";
		ar[1]= name;
		return new ModelAndView("welcome2","dataArray", ar);
	}
}
