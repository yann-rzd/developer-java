package fr.yann.developer.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {UppercaseValidator.class})
public @interface Uppercase {
	
	String message() default "Have to be written in upper case.";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
