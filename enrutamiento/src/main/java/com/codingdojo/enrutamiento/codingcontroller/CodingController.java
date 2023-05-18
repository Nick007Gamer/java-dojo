package com.codingdojo.enrutamiento.codingcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coding")
public class CodingController {
	
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/python")
	public String python() {
		return "python.jsp";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "java.jsp";
	}
	
	@RequestMapping("/aaa")
	public String xd() {
		return "aaaaa";
	}
	
}
