
package in.yazhini;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPriceEstimator {

	@Test
	public void testCase1() {
		// Enter the Valid Bookname and NoOfBooks and Display the amount to the user
		String bookName = "EnglishNovels";
		int noOfBooks = 5;
		double totalAmount = PriceEstimator.billAmount(bookName, noOfBooks);
		System.out.println("Expected Rs.1000 and actual: " + totalAmount);

	}

	@Test
	public void testCase2() {
		// Enter the InValid Details and also display its InValid details
		String bookName = "EnglishNovels";
		int noOfBooks = 21;
		double totalAmount = PriceEstimator.billAmount(bookName, noOfBooks);
		System.out.println("Expected Rs.1000 and actual: " + totalAmount);

	}

}
