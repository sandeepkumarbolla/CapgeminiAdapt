package com.springmvc.q6;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;

public class PhoneNumberValidator implements ConstraintValidator<Phone, PhoneNumber> {
	@Override
    public void initialize(Phone constraintAnnotation) {

    }

    @Override
    public boolean isValid(PhoneNumber phoneNumber, ConstraintValidatorContext context) {
        if(phoneNumber.getLocale()==null || phoneNumber.getValue()==null){
            return false;
        }
        try{
            PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
            return phoneNumberUtil.isValidNumber(phoneNumberUtil.parse(phoneNumber.getValue(), phoneNumber.getLocale()));
        }
        catch (NumberParseException e){
            return false;
        }
      }
}
