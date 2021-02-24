package com.springmvc.q6;

import java.util.Map.Entry;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ZipVa implements ConstraintValidator<Va, Zipi> {

	@Override
	public void initialize(Va constraintAnnotation) {

	}

	@Override
	public boolean isValid(Zipi zi, ConstraintValidatorContext context) {
		if (zi.getA() == "null" || zi.getB() == 0) {
			return false;
		}
		for (Entry<String, Integer> entry : zi.gett().entrySet()) {
			if (zi.getA().equals(entry.getKey())) {
				if (zi.getB() == entry.getValue()) {
					return true;
				}

			}
		}

		return false;
	}
}
