package com.codingdojo.mostrarfecha.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerFecha {
	
	
	@RequestMapping("/")
	public String index(Model model) {		
		
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String fecha(Model model) {
		Date fecha = new java.util.Date(Calendar.getInstance().getTimeInMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("E d MMMMM y ");
		String fechaTexto = formatter.format(fecha);
		model.addAttribute("prueba",fechaTexto);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date fecha = new java.util.Date(Calendar.getInstance().getTimeInMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		String fechaTexto = formatter.format(fecha);
		model.addAttribute("prueba",fechaTexto);
		return "time.jsp";
	}

}
