package com.wipro.ExceptionHandling;
import java.util.*;
public class UserRegistration {
	void registerUser(String username,String userCountry) throws InvalidCountryException{
		if(!userCountry.equals("India"))
			throw new InvalidCountryException();
		else 
			System.out.println("User Registration done successfully.");
	}
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			String name=sc.nextLine();
			String country=sc.nextLine();
			UserRegistration r=new UserRegistration();
			r.registerUser(name,country);
		}
		catch(InvalidCountryException e) {
		}
	}
}
