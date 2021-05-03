package in.yazhini;

public class CustomerPage {
	public static void displayWelcomeMessage(String name, int passWord, String emailId) {

		System.out.println("Welcome To CustomerPage");
		{ // Show the customer Details in properly
			if (name.equals("MuthuKumari")) {
				System.out.println("UserName :" + name);
			} else {
				System.out.println("Customer UserName is InValid");
			}
			String passWordString = String.valueOf(passWord);
			{ // Show the customer Details are incorrect
				if (passWordString.length() == 5) {
					System.out.println("UserName :" + passWord);
				} else {
					System.out.println("Customer Password is InValid");
				}
				System.out.println("Email-Id :" + emailId);
			}
		}
	}
}