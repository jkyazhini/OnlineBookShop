package in.yazhini;

public class Mainpage {

	public static void mainPage(String name, String name1) {

		System.out.println("1.ADMIN :\n2.CUSTOMER :"); // show the users

		if (name.equals("Admin")) { // user is a admin
			System.out.println("You are a Admin");

		} else if (name1.equals("Customer")) { // Then user is a customer
			System.out.println("You are Customer");

		}
	}

}
