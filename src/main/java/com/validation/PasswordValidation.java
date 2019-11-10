package com.validation;

import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class PasswordValidation {
	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public Map<Integer, String> passwordValidation(String userName, String password) {
		boolean valid = true;
		Map<Integer, String> result = new HashMap<Integer, String>();
		if (password.length() > 15 || password.length() < 8) {
			result.put(1, "Password should be less than 15 and more than 8 characters in length.");
		}
		if (password.indexOf(userName) != -1) {
			result.put(2, "Password Should not be same as user name.");
		}
		String upperCaseChars = "(.*[A-Z].*)";
		if (!password.matches(upperCaseChars)) {
			result.put(3, "Password should contain atleast one upper case alphabet.");
		}
		String lowerCaseChars = "(.*[a-z].*)";
		if (!password.matches(lowerCaseChars)) {
			result.put(4, "Password should contain atleast one lower case alphabet.");
		}
		String numbers = "(.*[0-9].*)";
		if (!password.matches(numbers)) {
			result.put(5, "Password should contain atleast one number.");
		}
		String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
		if (!password.matches(specialChars)) {
			result.put(6, "Password should contain atleast one special character.");
		} else {
			result.put(0, "true");
		}
		System.out.println("------------------------------------------------------");
		System.out.println(result);
		return result;
		
	}
/*
	public static void main(String[] args) {
		PasswordValidation pv = new PasswordValidation();
		//pv.passwordValidation("", "12");
		System.err.println("Venkata"+"\n"+"Sai");
	}*/
}