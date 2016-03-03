package com.testspring.verify;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class verify {
	@RequestMapping("/verify")
	public ModelAndView verify(@RequestParam("name") String name, @RequestParam("age") int age,
			@RequestParam("city") String city) {
		if (age < 18 || age > 90) {
			return new ModelAndView("error", "message", "Age must be between 18 and 90");
		} else {

			String validEntry = (name + " lives in " + city + ", and is " + age + " years old");

			return new ModelAndView("success", "message", validEntry);
		}
	}

}