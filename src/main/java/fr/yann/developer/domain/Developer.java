package fr.yann.developer.domain;

import java.util.Date;

public class Developer {
	
	private String pseudo;
	private String firstName;
	private String lastName;
	private Date birthday;
	
	public Developer() {
		
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Developer [pseudo=" + pseudo + ", firstName=" + firstName + ", lastName=" + lastName + ", birthday="
				+ birthday + "]";
	}

}
