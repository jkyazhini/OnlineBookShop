package in.yazhini;

import java.util.ArrayList;

public class SelectBooks {
	public static ArrayList<String> Validate(String bookName, String authorName, Integer bookPrice, Integer noOfBooks) {
		ArrayList<String> errors = new ArrayList<String>();
		boolean bookNameValidation = CustomerSelectBooks.validateBookName(bookName);
		if (bookNameValidation == false)
		// To check the input is proper or not that can be uesd to Boolean Validation//
		{
			errors.add("BookName is InValid");

			boolean authorNameValidation = CustomerSelectBooks.validateAuthorName(authorName);
			if (authorNameValidation == false) {
				errors.add("AuthorName is InValid");

				boolean bookPriceValidation = CustomerSelectBooks.validateBookPrice(bookPrice);
				if (bookPriceValidation == false) {
					errors.add("BookPrice is InValid");

					boolean noOfBooksValidation = CustomerSelectBooks.validateNoOfBooks(noOfBooks, bookName);
					if (noOfBooksValidation == false) {
						errors.add("NoOfBooks is InValid");
					}
				}
			}

		}
		return errors;
	}
}
