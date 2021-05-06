package fr.yann.developer.domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class Team {
	
	@NotNull
	@Length(min = 1, max = 255)
	private String name;
	@NotNull
	private Boolean agile;
	
	public Team() {
		//
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getAgile() {
		return agile;
	}
	
	public void setAgile(Boolean agile) {
		this.agile = agile;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", agile=" + agile + "]";
	}
	
}
