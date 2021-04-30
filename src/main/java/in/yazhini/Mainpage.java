package in.yazhini;

public class Mainpage {
	// todo: naming convention - method name and classname
	public static void name(String name, String Name) {
		System.out.println("1.ADMIN :\n2.CUSTOMER :"); // show the users
		if (name.equals("Admin")) { // user is a admin ( use equals)
			System.out.println("You are a Admin");

		} else if (Name.equals("Customer")) { // then user is a customer
			System.out.println("You are Customer");

		}
	}

}
