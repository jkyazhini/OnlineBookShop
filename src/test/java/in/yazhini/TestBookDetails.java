package in.yazhini;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBookDetails {

	@Test
	public void testCase() {
		/**
		 * This method used to add book details and display books
		 * 
		 * @param args
		 */
		System.out.println("\n BOOK DETAILS");
		System.out.println("BookName-AuthorName-BookPrice-NoOfBooks\n");

		BookDetails user1 = new BookDetails(); /**
												 * Store the available books user1.BookName = "Tamil Novels"; And
												 * authors name,price amount, user1.AuthorName="Thiruvalluvar"; then
												 * available number of books
												 **/
		user1.BookPrice = "Rs.200";
		user1.NoOfBooks = "10\n";

		BookDetails user2 = new BookDetails();
		user2.BookName = "English Novels";
		user2.AuthorName = "George Orwell";
		user2.BookPrice = "Rs.250";
		user2.NoOfBooks = "20\n";

		BookDetails user3 = new BookDetails();
		user3.BookName = "Mathematical Discoveries";
		user3.AuthorName = "Srinivasa Ramanujan";
		user3.BookPrice = "Rs.300";
		user3.NoOfBooks = "10\n";

		BookDetails user4 = new BookDetails();
		user4.BookName = "GK-India at Risk";
		user4.AuthorName = "Jaswant Singh";
		user4.BookPrice = "Rs.220";
		user4.NoOfBooks = "30\n";

		AdminUse.Add(user1, user2, user3, user4); // Call the AdminUse to display the Books
		AdminUse.displayBooks();

		int count1 = AdminUse.noOfBooks();
		System.out.println(count1);

		// 3 functionalities - add book , list books, count books

	}

}
