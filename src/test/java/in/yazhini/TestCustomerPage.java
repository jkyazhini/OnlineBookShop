package in.yazhini;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomerPage {

	@Test
	public void testCase1() {
		// correct input is stored
		String name = "MuthuKumari";
		int passWord = 12345;
		String emailId = "yazh@gmail.com";
		CustomerPage.displayWelcomeMessage(name, passWord, emailId);

	}

	@Test
	public void testCase2() {
		// When the input was wrong//
		String name = "P.MuthuKumari";
		int passWord = 123456;
		String emailId = "yazh@gmail.com";
		CustomerPage.displayWelcomeMessage(name, passWord, emailId);

		ViewBookDetails.viewBooks();
	}

}
