package validatorproject;

import java.util.Scanner;

public class RegexValidator {
	// Method for validating telephone Number
	public static String validateTelephoneNumber(String telephoneNumber) {
		boolean isValid = false;
		String phonePattern = "[1-9][0-9]+{2}-[1-9][0-9]+{2}-(\\d)+{4}|(\\([1-9][0-9]+{2}\\))[1-9][0-9]+{2}-(\\d)+{4}";
		
	
			try {
				
				if (telephoneNumber.equals("")){
					throw new NullPointerException();
				} else {
					System.out.println("\nYou Entered: "+telephoneNumber);
					if (telephoneNumber.matches(phonePattern))
						isValid = true;
					else
						throw new Exception();
					
				}
			}
			catch (NullPointerException e) {
				System.out.println("\nYou are in telephone number verification.");
			}
			catch (Exception e) {
				System.out.print("\nInvalid Telephone number.");
				System.out.println("\nCheck your entry and try again.");
			}
			
		if (isValid) {
			return telephoneNumber;
		} else {
			return null;
		}
		
		
		
	}
	// Method for validating name
	public static String validateName(String name) {
		boolean isValid = false;
		String namePattern = "[A-Z][a-z]+{3}[,] [A-Z][a-z]+{3}";
		
			try {
				
				if (name.equals("")){
					throw new NullPointerException();
				} else {
					System.out.println("\nYou Entered: "+name);
					if (name.matches(namePattern))
						isValid = true;
					else
						throw new Exception();
					
				}
			}
			catch (NullPointerException e) {
				System.out.println("\nYou are in name verification.");
			}
			catch (Exception e) {
				System.out.print("\nInvalid Name.");
				System.out.println("\nCheck your entry and try again.");
			}
			
		if (isValid) {
			return name;
		} else {
			return null;
		}
		
		
	}
	// Method for validating Y/N
	public static String validateYn(String yn) {
		boolean isValid = false;
		String ynPattern = "[yn]|[YN]";
		
			try {
				
				if (yn.equals("")){
					throw new NullPointerException();
				} else {
					System.out.println("\nYou Entered: "+yn);
					if (yn.matches(ynPattern))
						isValid = true;
					else
						throw new Exception();
					
				}
			}
			catch (NullPointerException e) {
				System.out.println("\nYou are in y/n verification.");
			}
			catch (Exception e) {
				System.out.print("\nInvalid y/n.");
				System.out.println("\nCheck your entry and try again.");
			}
			
			if(isValid)
				return yn;
			else
				return null;
						
		
		
	}
// Method for validating email
	public static String validateEmail(String email) {
		boolean isValid = false;
		String emailPattern = "[a-z0-9]+{4}[.][a-z0-9]+{3}[@][a-z0-9]+{4}[.][a-z0-9]+{3}";
		
			try {
				if (email.equals("")){
					throw new NullPointerException();
				} else {
					System.out.println("\nYou Entered: "+email);
					if (email.matches(emailPattern))
						isValid = true;
					else
						throw new Exception();
					
				}
			}
			catch (NullPointerException e) {
				System.out.println("\nYou are in Email verification.");
			}
			catch (Exception e) {
				System.out.print("\nInvalid Email.");
				System.out.println("\nCheck your entry and try again.");
			}
			
			if (isValid) {
				return email;
			} else {
				return null;
			}
		
		
	}
	
	
	
}
