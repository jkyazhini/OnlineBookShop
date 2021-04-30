package in.yazhini;

public class CustomerDetails {
	public static void details(String Name, long MobileNo, String Password, String Address1, String Address2,
			String Country) {
		// To Check the Details is true or not
		{
			if (Name.length() > 0) {
				System.out.println("NAME:" + Name);

				if (MobileNo > 5999999999L) {
					System.out.println("MOBILENO:" + MobileNo);
					if (Password.length() <= 8) {
						System.out.println("PASSWORD:" + Password);

						if (Address1.length() > 0) {
							System.out.println("ADDRESS 1:" + Address1);

							if (Address2.length() > 0) {

								System.out.println("ADDRESS 2:" + Address2);

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
