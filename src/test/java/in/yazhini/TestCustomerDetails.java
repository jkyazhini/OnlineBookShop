package in.yazhini;

import org.junit.Test;

public class TestCustomerDetails {
	// Customer Details is Valid//
	@Test
	public void testCase1() {
		
		System.out.println("WELCOME TO REGISTRATION\n"); // Input of a Customer Details
		String name = "P.MuthuKumari";
		long mobileNo = 9889876876L;
		String password = "succeeds";
		String address1 = "7BahavathSingh Street";
		String address2 = "Sivagangai";
		String country = "India";
		CustomerDetails.details(name, mobileNo, password, address1, address2, country);
	}

	@Test
	public void testCase2() {
		// Customer Details is InValid
		System.out.println("WELCOME TO REGISTRATION\n"); // Input of a Customer Details
		String name = "P.Muthu Kumari";
		long mobileNo = 988987876L;
		String password = "succeeds";
		String address1 = "7Bahavath Singh Street";
		String address2 = "madurai";
		String country = "India";
		CustomerDetails.details(name, mobileNo, password, address1, address2, country);
	}
}