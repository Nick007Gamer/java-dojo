package com.codingdojo.ninjagold.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PruebaController {	
	
	@RequestMapping("/prueba")
	public String prueba() {
		return "prueba.jsp";
	}
	

}
