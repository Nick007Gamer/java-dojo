package com.codingdojo.basedatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DatosController {
	
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
		
	}

}
