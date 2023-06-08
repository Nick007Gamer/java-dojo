package com.codingdojo.basedatos.models	;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "countries")
public class MyEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;
    
    @Column(name = "continent")
    private String continent;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "region")
    private String region;

    // Otros atributos y métodos
    
    
    public MyEntity() {
    	
    }
        
	public MyEntity(Long id, String code, String continent, String name, String region) {
		this.id = id;
		this.code = code;
		this.continent = continent;
		this.name = name;
		this.region = region;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
    




	               
}
