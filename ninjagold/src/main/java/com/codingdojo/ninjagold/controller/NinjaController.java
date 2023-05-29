package com.codingdojo.ninjagold.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaController {
	private int gold =0;
	private String lugar = "";
	
	//@RequestParam(value="name") String name
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String index(HttpSession sesion	) {
		sesion.setAttribute("gold", getGold(sesion));
		return "index.jsp";
	}
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String getIndex() {
		
		return "index.jsp";
	}
	
	@RequestMapping("/Farm")
	public String farm(HttpSession sesion) {
		Random random = new Random();
		int numero = random.nextInt(20 - 10 + 1) +10;
		setGold(sesion,getGold(sesion) +numero);
		setGoldGanado(numero);
		setLugar("Farm");
		return "redirect:/mensaje";
	}
	
	@RequestMapping("/Cave")
	public String cave(HttpSession sesion) {
		Random random = new Random();
		int numero = random.nextInt(10 - 5 + 1) +5;
		setGold(sesion,getGold(sesion) +numero);
		setGoldGanado(numero);
		setLugar("Cave");
		return "redirect:/mensaje";
	}

	
	@RequestMapping("/House")
	public String house(HttpSession sesion) {
		Random random = new Random();
		int numero = random.nextInt(5 - 2 + 1) +2;
		setGold(sesion,getGold(sesion) +numero);	
		setGoldGanado(numero);
		setLugar("House");
		return "redirect:/mensaje";
	}
	
	@RequestMapping("/Casino")
	public String casino(HttpSession sesion) {
		Random random = new Random();
		int numero = random.nextInt(10 - 1 + 1) +1;
		int numero2 = random.nextInt(50 - 1 + 1) +1; 
		if (numero <8) {
			setGold(sesion,getGold(sesion) + numero2);
			setGoldGanado(numero2);
		}else {
			setGold(sesion,getGold(sesion) - numero2);
			setGoldGanado(numero2);
		}
		setLugar("Casino");
		return "redirect:/mensaje";
	}
	
	
	@RequestMapping("/mensaje")
	public String flashMessages(RedirectAttributes redirectAttributes, HttpSession sesion) {
		int oro = getGoldGanado() ;
		String lugar = getLugar();
		LocalDateTime  fechaAhora = LocalDateTime.now();		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM, dd, yyyy HH:mm:ss");
		String fecha = fechaAhora.format(formatter);
		String mensaje = "Haz entrado a " +lugar +" y haz ganado " + oro + " de oro  ("+fecha+")";		
        redirectAttributes.addFlashAttribute("mensaje", mensaje);
        return "redirect:/";
	}
	
	
	private void setGoldGanado(int goldGanado) {
		gold = goldGanado;
	}
	
	private int getGoldGanado() {
		return gold;
	}
	
	private void setLugar(String place) {
		lugar = place;
	}
	
	
	private String getLugar() {
		return lugar;
	}

	
	@RequestMapping("/Reset")
	public String reset(HttpSession sesion) {
		setGold(sesion,0);
		System.out.println("resetiao");
		return "index.jsp";
	}

	
	private int getGold(HttpSession sesion) {
		Object sesionGold= sesion.getAttribute("gold");
		if(sesionGold == null) {
			setGold(sesion, 0);
			sesionGold= sesion.getAttribute("gold");
		}		
		return (Integer) sesionGold;	
	}
	
	private void setGold(HttpSession sesion, int gold) {
		sesion.setAttribute("gold", gold);
	}
	
	
	
		

}
