package in.yazhini;

public class CustomerPage {
	public static void displayWelcomeMessage(String name, int passWord, String emailId) {

		System.out.println("Welcome To CustomerPage");
		{
			if (name.equals("MuthuKumari")) {
				System.out.println("UserName :" + name); // Show the customer Details
			} else {
				System.out.println("Customer UserName is InValid");
			}
			String passWordString = String.valueOf(passWord);
			{
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