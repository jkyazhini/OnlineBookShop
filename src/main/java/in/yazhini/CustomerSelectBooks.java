package in.yazhini;

public class CustomerSelectBooks {
	// Store the BookName in Array
	public static boolean validateBookName(String bookName) {
		String[] arrayOfbookName = { "TamilNovels", "EnglishNovels", "MathsDiscoveries", "GKIndiaAtRisk" };
		for (int i = 0; i < arrayOfbookName.length; i++) {
			String userName = arrayOfbookName[i];
			if (bookName.equalsIgnoreCase(userName)) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}
	// AuthorName is declare to Array

	public static boolean validateAuthorName(String authorName) {
		String[] arrayOfauthorName = { "Thiruvalluvar", "George Orwell", "Srinivasa Ramanujan", "Jaswant Singh" };
		for (int i = 0; i < arrayOfauthorName.length; i++) {
			String userName = arrayOfauthorName[i];
			if (authorName.equals(userName)) {
				return true;
			} else {
				continue;
			}
		}
		return false;

	}

	// BookPrice is stored in the array
	public static boolean validateBookPrice(Integer bookPrice) {
		Integer[] arrayOfbookPrice = { 200, 250, 300, 350 };
		for (int i = 0; i < arrayOfbookPrice.length; i++) {
			int userPrice = arrayOfbookPrice[i];
			if (bookPrice.equals(userPrice)) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}

	public static boolean validateNoOfBooks(Integer NoOfBooks, String BookName)
	// No of books are stored then use some condition//
	{
		boolean isValid = false;
		switch (BookName) {
		case "TamilNovels": {
			if (NoOfBooks <= 10 && NoOfBooks > 0) {
				isValid = true;
				break;
			}
		}
		case "EnglishNovels": {
			if (NoOfBooks <= 20 && NoOfBooks > 0) {
				isValid = true;
				break;
			}
		}
		case "MathematicsDiscoveries": {
			if (NoOfBooks <= 10 && NoOfBooks > 0) {
				isValid = true;
				break;
			}
		}
		case "GKIndiaAtRisk": {
			if (NoOfBooks <= 20 && NoOfBooks > 0) {
				isValid = true;
				break;
			}

		}
		}
		return isValid;
	}
}