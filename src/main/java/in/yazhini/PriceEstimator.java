package in.yazhini;

public class PriceEstimator {
	public static double billAmount(String bookName, int noOfBooks) {
		double totalAmount = 0;
		if (noOfBooks > 0 && noOfBooks <= 10) {
			switch (bookName) {
			// wheather check the book details
			case "TamilNovels": {
				totalAmount = tamilNovels(noOfBooks);
				break;
			}
			case "EnglishNovels": {
				totalAmount = englishNovels(noOfBooks);
				break;
			}
			case "MathematicsDiscoveries": {
				totalAmount = mathematicsDiscoveries(noOfBooks);
				break;
			}
			case "GKIndiaAtRisk": {
				totalAmount = gkIndiaAtRisk(noOfBooks);
				break;
			}
			default: {
				System.out.println("Please Enter the valid BookName:");
				break;
			}
			}
		} else {
			System.out.println("NoOfBook is InValid :");
		}
		return totalAmount;
	}

	// Generate a Amount.Gst,Delivery charge and Total amount in each BookDetails
	public static double tamilNovels(int A) {
		double amount = (double) (A * 200);
		double GST = (double) 7 * (amount / 100);
		double totalAmount = GST + amount + 50;  //(Rs.50) is DeliverCharge//
		System.out.println("Total amount of TamilNovels = " + totalAmount);
		return totalAmount;

	}

	public static double englishNovels(int B) {
		double amount = (double) (B * 250);
		double GST = (double) 7 * (amount / 100);
		double totalAmount = GST + amount + 50;  //(Rs.50) is DeliverCharge//
		System.out.println("Total amount of EnglishNovels = " + totalAmount);
		return totalAmount;
	}

	public static double mathematicsDiscoveries(int C) {
		double amount = (double) (C * 300);
		double GST = (double) 7 * (amount / 100);
		double totalAmount = GST + amount + 50;    //(Rs.50) is DeliverCharge//
		System.out.println("Total amount of MathematicsDiscoveries = " + totalAmount);
		return totalAmount;
	}

	public static double gkIndiaAtRisk(int D) {
		double amount = (double) (D * 350);
		double GST = (double) 7 * (amount / 100);
		double totalAmount = GST + amount + 50;   //(Rs.50) is DeliverCharge//
		System.out.println("Total amount of GKIndiaAtrisk = " + totalAmount);
		return totalAmount;
	}
}
