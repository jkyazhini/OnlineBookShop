package in.yazhini;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestCustomerSelectBooks {

	@Test
	public void testCase1() {
		// Valid BookDetails from the Customer//
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
		// InValid BookDetails from the Customer//
		String bookName = "EnglisNovels";
		String authorName = "Williams";
		int bookPrice = 250;
		int noOfBooks = 5;
		ArrayList<String> errors = SelectBooks.Validate(bookName, authorName, bookPrice, noOfBooks);
		if (errors.isEmpty()) {
		    System.out.println("BOOK NAME   :" + bookName);
			System.out.println("AUTHOR NAME :" + authorName);
			System.out.println("BOOK PRICE  :" + bookPrice);
			System.out.println("NO OF BOOKS :" + noOfBooks);

			// SelectBooks.Validate(BookName,AuthorName,BookPrice,NoOfBooks);

		} else {
			System.out.println("User details are Invalid");

			System.out.println("Errors\n" + errors);
		}
		assertEquals(false, errors.isEmpty());
	}

}
