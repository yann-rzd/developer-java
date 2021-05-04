package fr.yann.developer.domain;

public class Skill {
	
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
