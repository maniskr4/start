package com.cdac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String gethome(Model model)
	
	{
		model.addAttribute("name", "Hello world");
		//model.addAttribute("name","Earth");
		return "welcome";
	}

}
