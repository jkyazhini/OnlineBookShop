package in.yazhini;

public class CustomerDetails {
	public static void details(String name, long mobileNo, String password, String address1, String address2,
			String Country) {
		// To Check the Customer Details is true or not
		{
			if (name.length() > 0) {
				System.out.println("NAME:" + name);

				if (mobileNo > 5999999999L) {
					System.out.println("MOBILENO:" + mobileNo);
					if (password.length() <= 8) {
						System.out.println("PASSWORD:" + password);

						if (address1.length() > 0) {
							System.out.println("ADDRESS 1:" + address1);

							if (address2.length() > 0) {

								System.out.println("ADDRESS 2:" + address2);

								System.out.println("COUNTRY:" + Country);

							} else {
								System.out.println("Address2 is InValid");
							}
						} else {
							System.out.println("Address1 is InValid");
						}
					} else {
						System.out.println("Password is InValid");
					}
				} else {
					System.out.println("MobileNo is InValid");
				}
			} else {
				System.out.println("Name is InValid");
			}
		}
	}
}
