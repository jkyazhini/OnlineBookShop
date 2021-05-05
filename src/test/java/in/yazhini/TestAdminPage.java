package in.yazhini;

import org.junit.Test;

public class TestAdminPage {
	/** Declare the Valid Admin Details **/
	@Test
	public void testCase1() {
		String name = "Yazhini";
		String userId = 12345678L;
		AdminPage.displayWelcome(name, userId);
	}

	/** Declare the InValid Admin Details **/
	@Test
	public void testCase2() {
		String name = "kumari";
		String userId = 12345L;
		AdminPage.displayWelcome(name, userId);
	}

}
