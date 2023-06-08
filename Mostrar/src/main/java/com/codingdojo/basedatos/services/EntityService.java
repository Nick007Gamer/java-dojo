package com.codingdojo.basedatos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.basedatos.models.MyEntity;
import com.codingdojo.basedatos.repository.EntityRepository;

@Service
public class EntityService {
    private final EntityRepository entityRepository;
    
    public EntityService(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }
    
    //Devolviendo todos los libros.
    public List<MyEntity> allEntitys() {
        return (List<MyEntity>) entityRepository.findAll();
    }
    
    //Creando un libro.
    public MyEntity createBook(MyEntity b) {
        return entityRepository.save(b);
    }
    
    //Obteniendo la información de un libro
    public MyEntity findBook(Long id) {
        Optional<MyEntity> optionalEntity= entityRepository.findById(id);
        if(optionalEntity.isPresent()) {
            return optionalEntity.get();
        } else {
            return null;
        }
    }
    
    public MyEntity updateEntity( MyEntity b) {
    	
    	return entityRepository.save(b);
    }
    
    public void deleteEntity(Long id) {
    	 entityRepository.deleteById(id);
    }

}
