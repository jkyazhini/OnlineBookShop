package in.yazhini;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestCustomerSelectBooks {

	@Test
	public void testCase1() {
		// Properly added the input
		String BookName = "TamilNovels";
		String AuthorName = "Thiruvalluvar";
		int BookPrice = 200;
		int NoOfBooks = 5;
		ArrayList<String> errors = SelectBooks.Validate(BookName, AuthorName, BookPrice, NoOfBooks);
		if (errors.isEmpty()) {
			System.out.println("All user details are valid");
			System.out.println("BOOK NAME   :" + BookName);
			System.out.println("AUTHOR NAME :" + AuthorName);
			System.out.println("BOOK PRICE  :" + BookPrice);
			System.out.println("NO OF BOOKS :" + NoOfBooks);

			// SelectBooks.Validate(BookName,AuthorName,BookPrice,NoOfBooks);

		} else {
			System.out.println("Errors\n" + errors);
		}
		assertEquals(true, errors.isEmpty());
	}

	@Test
	public void testCase2() {
		// choice of BooksDetails is Wrong
		String BookName = "English Novels";
		String AuthorName = "Williams";
		int BookPrice = 250;
		int NoOfBooks = 5;
		ArrayList<String> errors = SelectBooks.Validate(BookName, AuthorName, BookPrice, NoOfBooks);
		if (errors.isEmpty()) {
			System.out.println("All user details are valid");

			System.out.println("BOOK NAME   :" + BookName);
			System.out.println("AUTHOR NAME :" + AuthorName);
			System.out.println("BOOK PRICE  :" + BookPrice);
			System.out.println("NO OF BOOKS :" + NoOfBooks);

			// SelectBooks.Validate(BookName,AuthorName,BookPrice,NoOfBooks);

		} else {
			System.out.println("Errors\n" + errors);
		}
	}

}
