package com.validation;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class EmailValidation {
	
	public static boolean emailvalidation(String email) {
		String EMAIL_PATTERN = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		List<String> forbiddenDomains = Arrays.asList("yahoo", "outlook");
		if (email == null || email.trim().equals("")) {
			return false;
		}
		if (!pattern.matcher(email).matches()) {
			return false;
		}
		if (forbiddenDomains.contains(email)) {
			return false;
		}

		return true;
	}
}

