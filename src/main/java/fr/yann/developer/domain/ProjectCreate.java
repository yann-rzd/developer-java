package fr.yann.developer.domain;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

public class ProjectCreate {
	
	@NotBlank
	@Length(min = 1, max = 255)
	private String name;
	@NotBlank
	@Length(min = 100, max = 1000)
	private String description;
	@NotNull
	@FutureOrPresent
	private LocalDate startDate;
	private LocalDate endDate;
	@Positive
	private Integer annualBudget;
	
	public ProjectCreate() {
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

	public Integer getAnnualBudget() {
		return annualBudget;
	}

	public void setAnnualBudget(Integer annualBudget) {
		this.annualBudget = annualBudget;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", description=" + description + ", startDate=" + startDate + ", endDate="
				+ endDate + ", annualBudget=" + annualBudget + "]";
	}

}
