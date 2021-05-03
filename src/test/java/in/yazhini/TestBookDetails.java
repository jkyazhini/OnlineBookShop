package in.yazhini;

import  org.junit.Test;

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
		user1.bookName="TamilNovels";
		user1.authorName="Thiruvalluvar";										
		user1.bookPrice = "Rs.200";
		user1.noOfBooks = "10\n";

		BookDetails user2 = new BookDetails();
		user2.bookName = "English Novels";
		user2.authorName = "George Orwell";
		user2.bookPrice = "Rs.250";
		user2.noOfBooks = "20\n";

		BookDetails user3 = new BookDetails();
		user3.bookName = "Mathematical Discoveries";
		user3.authorName = "Srinivasa Ramanujan";
		user3.bookPrice = "Rs.300";
		user3.noOfBooks = "10\n"; 

		BookDetails user4 = new BookDetails();
		user4.bookName = "GK-India at Risk";
		user4.authorName = "Jaswant Singh";
		user4.bookPrice = "Rs.220";
		user4.noOfBooks = "30\n";

	

		AdminUse.addBookDetails(user1, user2, user3, user4); // Call the AdminUse to display the Books
		AdminUse.displayBooks();

		int count1 = AdminUse.noOfBooks();
		System.out.println("Total Count is =" +count1);

		// 3 functionalities - add book , list books, count books

	}

}
