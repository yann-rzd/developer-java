package fr.yann.developer.domain;

import java.time.LocalDate;

import fr.yann.developer.validation.LegalBirthDate;

public class DeveloperCreate {
	
	private String pseudo;
	private String firstName;
	private String lastName;
	@LegalBirthDate
	private LocalDate birthDate;
	
	public DeveloperCreate() {
		//
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Developer [pseudo=" + pseudo + ", firstName=" + firstName + ", lastName=" + lastName + ", birthdate="
				+ birthDate + "]";
	}

}
