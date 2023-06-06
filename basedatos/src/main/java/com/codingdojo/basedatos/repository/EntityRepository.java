package com.codingdojo.basedatos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.basedatos.models.MyEntity;


@Repository
public interface EntityRepository extends CrudRepository<MyEntity, Long>{

}
