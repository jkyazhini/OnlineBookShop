package in.yazhini;

import java.util.ArrayList;

public class AdminUse {
	static ArrayList<BookDetails> userList = new ArrayList<BookDetails>();

	public static void Add(BookDetails user1, BookDetails user2, BookDetails user3, BookDetails user4) {

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
//		 Display all user details
//		 for (BookDetails user : userList) {
//		 System.out.println(user.BookName + "/" +user.AuthorName + "-" +
//		 user.BookPrice + "-" + user.NoOfBooks);
	}

	public static int noOfBooks() {
		int noOfBooks = userList.size(); // Count the Number of books
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
