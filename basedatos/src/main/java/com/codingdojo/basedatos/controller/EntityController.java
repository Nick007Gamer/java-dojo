package com.codingdojo.basedatos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.basedatos.models.MyEntity;
import com.codingdojo.basedatos.services.EntityService;

import jakarta.validation.Valid;

@Controller
public class EntityController {
	  private final EntityService entityService;
	    
	  public EntityController(EntityService entityService) {
	        this.entityService = entityService;
	   }
	    
	  @RequestMapping("/entity")
	  public String index(Model model) {
	        List<MyEntity> entity = entityService.allEntitys();
	        model.addAttribute("entity", entity);
	        return "/entity/index.jsp";
	  }
	  
	    @RequestMapping("/entity/new")
	    public String newBook(@ModelAttribute("entity") MyEntity entity) {
	        return "/entity/new.jsp";
	    }
	    
	    
	    @RequestMapping("/entity/{id}")
	    public String showEntity(@PathVariable("id") Long id,Model model) {	    	
	    	MyEntity entity = entityService.findBook(id);
	    	model.addAttribute("entity", entity);
	    	return "/entity/show.jsp";
	    }
	    
	    
	    @RequestMapping(value="/entity", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("entity") MyEntity entity, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/entity/new.jsp";
	        } else {                                             
	        	entityService.createBook(entity);
	            return "redirect:/entity";
	        }
	    }

}
