package in.yazhini;

import java.util.ArrayList;

public class SelectBooks {
	public static ArrayList<String> Validate(String BookName, String AuthorName, Integer BookPrice, Integer NoOfBooks) {
		ArrayList<String> errors = new ArrayList<String>();
		boolean bookNameValidation = CustomerSelectBooks.validateBookName(BookName);
		if (bookNameValidation == false)
		// To check the input is proper or not that can be uesd to Boolean Validation//
		{
			errors.add("BookName is InValid");
			boolean authorNameValidation = CustomerSelectBooks.validateAuthorName(AuthorName);
			if (authorNameValidation == false) {
				errors.add("AuthorName is InValid");
				boolean bookPriceValidation = CustomerSelectBooks.validateBookPrice(BookPrice);
				if (bookPriceValidation == false) {
					errors.add("BookPrice is InValid");
					boolean noOfBooksValidation = CustomerSelectBooks.validateNoOfBooks(NoOfBooks, BookName);
					if (noOfBooksValidation == false) {
						errors.add("NoOfBooks is InValid");
					}
				}
			}

		}
		return errors;
	}
}
