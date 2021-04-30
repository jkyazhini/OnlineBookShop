package in.yazhini;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdminPage {

	@Test
	public void testCase1() {
		String name = "Yazhini";
		long userId = 12345678L; // naming convention /**Declare the admin Details**/
		AdminPage.displayWelcome(name, userId);
	}

	@Test
	public void testCase2() {
		String name = "kumari";
		long userId = 12345L; // naming convention /**Declare the admin Details**/
		AdminPage.displayWelcome(name, userId);
	}

}
