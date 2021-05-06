package fr.yann.developer.domain;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class DeveloperPatch {
	
	@NotNull
	private LocalDate birthDate;
	
	public DeveloperPatch() {
		//
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Developer birthDate =" + birthDate;
	}
}
