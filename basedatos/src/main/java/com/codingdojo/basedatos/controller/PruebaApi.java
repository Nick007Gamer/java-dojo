package com.codingdojo.basedatos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.basedatos.models.MyEntity;
import com.codingdojo.basedatos.services.EntityService;

@RestController
public class PruebaApi {

	private final EntityService entityService;
    public PruebaApi(EntityService entityService){
        this.entityService = entityService;
    }
    
    @RequestMapping("/api/services")
    public List<MyEntity> index() {
        return entityService.allEntitys();
    }
    
    @RequestMapping(value="/api/services", method=RequestMethod.POST)
    public MyEntity create(@RequestParam(value="id") Long id, @RequestParam(value="code") String code, @RequestParam(value="continent") String continent, @RequestParam(value="name") String name,@RequestParam(value="region") String region) {
        MyEntity book = new MyEntity(id, code, continent, name, region);
        return entityService.createBook(book);
    }
    
    @RequestMapping("/api/services/{id}")
    public MyEntity show(@PathVariable("id") Long id) {
    	MyEntity book = entityService.findBook(id);
        return book;
    }	

    //Otros métodos han sido removidos para resumir.
    @RequestMapping(value="/api/entity/{id}", method=RequestMethod.PUT)
    public MyEntity update(@PathVariable("id") Long id, @RequestParam(value="code") String code, @RequestParam(value="continent") String continent, @RequestParam(value="name") String name, @RequestParam(value="region") String region) {
    	MyEntity book = entityService.findBook(id);
    	book.setId(id);
    	book.setCode(code);
    	book.setContinent(continent);
    	book.setName(name);
    	book.setRegion(region);
    	entityService.updateEntity(book);
    	
        return book;
    }
    
    @RequestMapping(value="/api/entity/{country_id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("country_id") Long id) {

    	entityService.deleteEntity(id);
    }
}
