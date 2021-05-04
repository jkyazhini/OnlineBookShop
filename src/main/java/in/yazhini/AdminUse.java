package in.yazhini;

import java.util.ArrayList;

public class AdminUse {
	static ArrayList<BookDetails> userList = new ArrayList<BookDetails>();

	// For purpose of Add the BookDetails to the Admin//
	public static void addBookDetails(BookDetails  ...books) {
         for (BookDetails bookDetails : books) {
             bookList.add(bookDetails);
		}
		
	
	  
//		 Display all user details
//		 for (BookDetails user : userList) {
//		 System.out.println(user.BookName + "/" +user.AuthorName + "-" +
//		 user.BookPrice + "-" + user.NoOfBooks);
	}

	// Count the Number of books
	public static int noOfBookName() {
		int noOfBookName = userList.size();
		return noOfBookName;
	}

	public static void displayBooks() {

		// R2: Display BookDetails
		System.out.println("############ LIST OF BOOKS #########");
		for (BookDetails bookName : userList) {
			System.out.println(bookName);
		}
	}
}
