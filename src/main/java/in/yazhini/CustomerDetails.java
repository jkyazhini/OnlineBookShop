package in.yazhini;

public class CustomerDetails {
	public static void details(String name, long mobileNo, String password, String address1, String address2,
			String Country) {
		// To Check the Customer Details is true or not
		if (nameValidation(name)) {
			System.out.println("NAME:" + name);
			if (mobileNoValidation(mobileNo)) {
				System.out.println("MOBILENO:" + mobileNo);
				if (passwordValidation(password)) {
					System.out.println("PASSWORD:" + password);
				}
			}
		}

		if (address1Validation(address1) && address2Validation(address2)) {
			System.out.println("ADDRESS 1:" + address1);
			System.out.println("ADDRESS 2:" + address2);

			System.out.println("COUNTRY:" + Country);
		}
	}

	public static boolean nameValidation(String name) {
		if (name.length() > 0 ) {
			return true;
		}
		System.out.println("Name is InValid");
		return false;
	}

	public static boolean mobileNoValidation(long mobileNo) {
		if (mobileNo > 5999999999L) {
			return true;
		}
		System.out.println("MobileNo is InValid");
		return false;

	}

	public static boolean passwordValidation(String password) {
		if (password.length() < 9) {
			return true;
		}
		System.out.println("Password is InValid");
		return false;
	}

	public static boolean address1Validation(String address1) {
		if (address1.length() > 0) {
			return true;
		}
		System.out.println("Address1 is InValid");
		return false;

	}

	public static boolean address2Validation(String address2) {
		if (address2.length() > 0) {
			return true;
		}
		System.out.println("Address2 is InValid");
		return false;
	}
}
