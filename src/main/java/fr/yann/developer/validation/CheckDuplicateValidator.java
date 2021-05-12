package fr.yann.developer.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.yann.developer.domain.ProjectCreate;

public class CheckDuplicateValidator implements ConstraintValidator<CheckDuplicate, ProjectCreate> {
	
	@Override
	public boolean isValid(ProjectCreate value, ConstraintValidatorContext context) {
		
		if (value == null) {
			return true;
		}
		
		
		return !value.getDescription().equals(value.getName());
	}
}
