package com.codingdojo.contador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CountController {
	private int count;
	
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("count");   	    
			setCounter(count+=1);	    
		    session.setAttribute("count", count);
		    model.addAttribute("contador", count);
		    System.out.println(getCount());
			return "index.jsp";  
	}
	
	@RequestMapping("/counter")
	public String counter(Model model) {
		model.addAttribute("contador",getCount());
		return "counter.jsp";
		
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		setCounter(0);
		session.setAttribute("count", count);
		return "index.jsp";
	}
	
	private void setCounter(int contador) {
		this.count = contador;
	}
	
	
	private int getCount() {
		return this.count;
	}
	
	

}
