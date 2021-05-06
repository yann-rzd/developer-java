package fr.yann.developer.domain;

public class Team {
	
	private String name;
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
