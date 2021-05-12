package fr.yann.developer.validation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = CheckDuplicateValidator.class)
public @interface CheckDuplicate {
	
	String message() default "The description must not be the same of name";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
