package in.yazhini;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestCustomerDetails {

	@Test
	public void testCase1() {
		// Input is correctly stored
		System.out.println("WELCOME TO REGISTRATION\n"); // Input of a Customer Details
		String Name = "P.MuthuKumari";
		long MobileNo = 9889876876L;
		String Password = "succeeds";
		String Address1 = "7BahavathSingh Street";
		String Address2 = "Sivagangai";
		String Country = "India";
		CustomerDetails.details(Name, MobileNo, Password, Address1, Address2, Country);
	}

	@Test
	public void testCase2() {
		// Input is wrong to check valid input
		System.out.println("WELCOME TO REGISTRATION\n"); // Input of a Customer Details
		String Name = "P.Muthu Kumari";
		long MobileNo = 988987876L;
		String Password = "succeeds";
		String Address1 = "7Bahavath Singh Street";
		String Address2 = "madurai";
		String Country = "India";
		CustomerDetails.details(Name, MobileNo, Password, Address1, Address2, Country);
	}
}