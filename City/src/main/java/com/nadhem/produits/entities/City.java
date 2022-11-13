package com.nadhem.produits.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;





@Entity
public class City {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCity;
	private String nomCity;
	private String descriptionCity;
	private Double space;
	
	public City() {
		super();
	}

	public City( String nomCity, String descriptionCity ,Double space) {
		super();
		this.nomCity = nomCity;
		this.descriptionCity = descriptionCity;
		this.space=space;
	}

	public Double getSpace() {
		return space;
	}

	public void setSpace(Double space) {
		this.space = space;
	}

	@ManyToOne
	private Country country;
	
	public Long getIdCity() {
		return idCity;
	}

	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}

	public String getNomCity() {
		return nomCity;
	}

	public void setNomCity(String nomCity) {
		this.nomCity = nomCity;
	}

	public String getDescriptionCity() {
		return descriptionCity;
	}

	public void setDescriptionCity(String descriptionCity) {
		this.descriptionCity = descriptionCity;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}


	
	
	
}
