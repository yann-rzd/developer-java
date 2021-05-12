package fr.yann.developer.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

public class ProjectPatch {

    @NotBlank
    @Length(min = 100, max = 1000)
    private String description;
    @Positive
    private Integer annualBudget;

    public ProjectPatch() {
	//
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Integer getAnnualBudget() {
	return annualBudget;
    }

    public void setAnnualBudget(Integer annualBudget) {
	this.annualBudget = annualBudget;
    }

    @Override
    public String toString() {
	return "ProjectPatch [description=" + description + ", annualBudget=" + annualBudget + "]";
    }

}
