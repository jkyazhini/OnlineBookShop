package in.yazhini;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMainPage {

	@Test
	public void test() {
		String name = "Admin";
		String Name = "Customer";
		// user is admin so go to admin page
		Mainpage.name(name, Name);

	}
}
