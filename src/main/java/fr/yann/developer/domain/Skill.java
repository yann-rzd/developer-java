package fr.yann.developer.domain;

import javax.validation.constraints.NotNull;

import fr.yann.developer.validation.Uppercase;

public class Skill {

    @NotNull
    @Uppercase
    private String name;

    public Skill() {
	// Public constructor without arguments
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
