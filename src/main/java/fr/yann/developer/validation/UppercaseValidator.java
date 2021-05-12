package fr.yann.developer.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UppercaseValidator implements ConstraintValidator<Uppercase, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

	if (value == null) {
	    return true;
	}

	String uppercased = value.toUpperCase();
	return value.equals(uppercased);
    }
}
