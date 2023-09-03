package com.compositepk.api.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COMP_Pk")
public class CompositePkEntity {
	@EmbeddedId
	private CompositePkId pkId;
	private String name;
	private String city;

	/**
	 * 
	 */
	public CompositePkEntity() {
		super();
	}

	/**
	 * @param pkId
	 * @param name
	 * @param city
	 */
	public CompositePkEntity(CompositePkId pkId, String name, String city) {
		super();
		this.pkId = pkId;
		this.name = name;
		this.city = city;
	}

	/**
	 * @return the pkId
	 */
	public CompositePkId getPkId() {
		return pkId;
	}

	/**
	 * @param pkId the pkId to set
	 */
	public void setPkId(CompositePkId pkId) {
		this.pkId = pkId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

}
