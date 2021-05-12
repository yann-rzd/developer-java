package fr.yann.developer.validation;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LegalBirthDateValidator implements ConstraintValidator<LegalBirthDate, LocalDate> {
    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {

	if (value == null) {
	    return true;
	}

	LocalDate currentDate = LocalDate.now();
	LocalDate legalAge = currentDate.minusYears(18);

	if (value.isBefore(legalAge) || value.isEqual(legalAge)) {
	    return true;
	} else {
	    return false;
	}

    }
}
