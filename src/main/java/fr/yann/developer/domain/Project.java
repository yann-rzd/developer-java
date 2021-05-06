package fr.yann.developer.domain;

import java.time.LocalDate;

public class Project {
	
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private int annualBudget;
	
	public Project() {
		//
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getAnnualBudget() {
		return annualBudget;
	}

	public void setAnnualBudget(int annualBudget) {
		this.annualBudget = annualBudget;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", description=" + description + ", startDate=" + startDate + ", endDate="
				+ endDate + ", annualBudget=" + annualBudget + "]";
	}

}
