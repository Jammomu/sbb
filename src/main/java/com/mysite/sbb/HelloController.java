package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/hello")
//	@ResponseBody
	public String hello(Model model) {
		model.addAttribute("name", "Go Gildong");
		model.addAttribute("message", "Hello, Thymeleaf");
		return "hello";
	}
}
