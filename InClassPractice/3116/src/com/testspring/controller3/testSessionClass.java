package com.testspring.controller3;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testSessionClass {
	@RequestMapping("/welcome3")
	public ModelAndView keepSession(HttpSession session) {
		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		Integer c = (Integer) session.getAttribute("counter");
		c++;
		session.setAttribute("counter", c);
		return new ModelAndView("welcome3","sessionCounter",c);
	}
}
