package com.codingdojo.cadenas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadenasController {
	
	@RequestMapping("/")	
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/random")	
	public String random() {
		return "random.jsp";
	}
	

}
