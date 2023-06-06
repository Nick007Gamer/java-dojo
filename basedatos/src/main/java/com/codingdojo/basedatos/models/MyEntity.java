package com.codingdojo.basedatos.models	;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cities")
public class MyEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "country_code")
    private String country_code;
    
    @Column(name = "disctrict")
    private String disctrict;
    
    @Column(name = "population")
    private String population;

    // Otros atributos y métodos
    
    
    public MyEntity() {
    	
    }
    


	public MyEntity(Long id, String name, String country_code, String disctrict, String population) {
		super();
		this.id = id;
		this.name = name;
		this.country_code = country_code;
		this.disctrict = disctrict;
		this.population = population;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getDisctrict() {
		return disctrict;
	}

	public void setDisctrict(String disctrict) {
		this.disctrict = disctrict;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}
    
    
    
    
    
}
