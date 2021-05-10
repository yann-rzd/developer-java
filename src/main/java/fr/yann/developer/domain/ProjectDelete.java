package fr.yann.developer.domain;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;

public class ProjectDelete {
	
	@FutureOrPresent
	private LocalDate endDate;
	
	public ProjectDelete() {
		//
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "ProjectDelete [endDate=" + endDate + "]";
	}
	
	
}
