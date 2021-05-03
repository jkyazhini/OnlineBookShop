package in.yazhini;

public class BookDetails {
            //To declare the list in purpose of retrieve
	@Override
	public String toString() {
		return " BookName=" + bookName + ", AuthorName=" + authorName + ", BookPrice=" + bookPrice
				+ ", NoOfBooks=" + noOfBooks + " ";
		// **Generate to string the array set of Bookdetails**//
	}

	public String bookName;
	public String authorName;
	public String bookPrice;
	public String noOfBooks;

}
