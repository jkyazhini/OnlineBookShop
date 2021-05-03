package in.yazhini;

import java.util.ArrayList;

public class AdminUse {
	static ArrayList<BookDetails> userList = new ArrayList<BookDetails>();

	// For purpose of Add the BookDetails to the Admin//
	public static void addBookDetails(BookDetails user1, BookDetails user2, BookDetails user3, BookDetails user4) {

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
	  
//		 Display all user details
//		 for (BookDetails user : userList) {
//		 System.out.println(user.BookName + "/" +user.AuthorName + "-" +
//		 user.BookPrice + "-" + user.NoOfBooks);
	}

	// Count the Number of books
	public static int noOfBooks() {
		int noOfBooks = userList.size();
		return noOfBooks;
	}

	public static void displayBooks() {

		// R2: Display BookDetails
		System.out.println("############ LIST OF BOOKS #########");
		for (BookDetails bookName : userList) {
			System.out.println(bookName);
		}
	}
}
