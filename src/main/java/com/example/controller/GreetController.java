package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {
	@RequestMapping("/sayHello")
   public String hellouser(Model model	) {
		model.addAttribute("message","have a good day");
		model.addAttribute("message","have a good day");
	return "Sucess";
	   
   }
}
