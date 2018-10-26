package com.day8;

public class RegExpresion {

	public static void main(String[] args) {
		/*
		You are updating the username policy on your company's internal networking platform. 
		According to the policy, a username is considered valid if all the following constraints are satisfied:
		•	The username consists   of 8 to 30 characters inclusive. 
		If the username consists of less than or greater than characters, then it is an invalid username.
		•	The username can only contain alphanumeric characters and underscores (_). 
		Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits.
		•	The first character of the username must be an alphabetic character, i.e., either lowercase character or uppercase character.
		For example: Username Validity
		
		Julia		INVALID; Username length < 8 characters
		Samantha VALID
		Samantha_21  VALID

		INVALID; Username begins with non-alphabetic character

		Samantha?21 INVALID; '?' character not allowed
		Update the value of regularExpression field in the UsernameValidator class 
		so that the regular expression only matches with valid usernames.

		 */
		String str = "AiGorplas";
		usernameValidator(str);
	}
	
	public static void usernameValidator(String str) {
		//^[A-z]\\w{7,29}$
		if (str.matches("^[a-zA-Z]")) {
			System.out.println("valid Username: " + str);
		}else {
			System.out.println("not valid username: " + str);
		}
	}
		
}
