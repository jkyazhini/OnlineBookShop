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

		BookDetails book1 = new BookDetails(); /**
												 * Store the available books user1.BookName = "Tamil Novels"; And
												 * authors name,price amount, user1.AuthorName="Thiruvalluvar"; then
												 * available number of books
		                                          **/
		book1.bookName="TamilNovels";
		book1.authorName="Thiruvalluvar";										
		book1.bookPrice = "Rs.200";
		book1.noOfBooks = "10\n";

		BookDetails book2 = new BookDetails();
		book2.bookName = "English Novels";
		book2.authorName = "George Orwell";
		book2.bookPrice = "Rs.250";
		book2.noOfBooks = "20\n";

		BookDetails book3 = new BookDetails();
		book3.bookName = "Mathematical Discoveries";
		book3.authorName = "Srinivasa Ramanujan";
		book3.bookPrice = "Rs.300";
		book3.noOfBooks = "10\n"; 

		BookDetails book4 = new BookDetails();
		book4.bookName = "GK-India at Risk";
		book4.authorName = "Jaswant Singh";
		book4.bookPrice = "Rs.220";
		book4.noOfBooks = "30\n";

	

		AdminUse.addBookDetails(book1, book2, book3, book4); // Call the AdminUse to display the Books
		AdminUse.displayBooks();

		int count1 = AdminUse.noOfBooks();
		System.out.println("Total BookName is =" +count1);

		// 3 functionalities - add book , list books, count books

	}

}
