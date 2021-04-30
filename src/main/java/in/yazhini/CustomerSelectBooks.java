package in.yazhini;

public class CustomerSelectBooks {

	public static boolean validateBookName(String bookname) { // Only store the BookName in array
		String[] arrayOfbookName = { "TamilNovels", "EnglishNovels", "MathsDiscoveries", "GKIndiaAtRisk" };
		for (int i = 0; i < arrayOfbookName.length; i++) {
			String userName = arrayOfbookName[i];
			if (bookname.equalsIgnoreCase(userName)) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}

	public static boolean validateAuthorName(String authorName) // AuthorName is declare to array
	{
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

	public static boolean validateBookPrice(Integer bookPrice) { // BookPrice is stored in the array
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
	// no of books are stored then use some condition//
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