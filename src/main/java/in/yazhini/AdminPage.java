package in.yazhini;

public class AdminPage {
	// Stored the data in Admin use
	public static void displayWelcome(String name, String userId) {
		System.out.println("Welcome To AdminPage");
		{
			if (name.equals("Yazhini")) {
				System.out.println("UserName :" + name);

			} else {
				System.out.println("UserName is Wrong");
			}

			{
				if (userId.length()==8) {
					System.out.println("UserId :" + userId);
				} else {
					System.out.println("UserId is Wrong");
				}

			}
		}
	}
}
