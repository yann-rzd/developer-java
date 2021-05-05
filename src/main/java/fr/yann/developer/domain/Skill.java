package fr.yann.developer.domain;

import javax.validation.constraints.NotNull;

public class Skill {
	
	@NotNull
	private String name;

	public Skill() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
