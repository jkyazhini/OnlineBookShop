package in.yazhini;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPriceEstimator {

	@Test
	public void testCase1() {
		// Enter the Valid Bookname and NoOfBooks and Display the amount to the user
		String BookName = "EnglishNovels";
		int NoOfBooks = 5;
		double TotalAmount = PriceEstimator.BillAmount(BookName, NoOfBooks);
		System.out.println("Expected Rs.1000 and actual: " + TotalAmount);

	}

	@Test
	public void testCase2() {
		// Enter the InValid Details and also display its InValid details
		String BookName = "EnglishNovels";
		int NoOfBooks = 21;
		double TotalAmount = PriceEstimator.BillAmount(BookName, NoOfBooks);
		System.out.println("Expected Rs.1000 and actual: " + TotalAmount);

	}

}
