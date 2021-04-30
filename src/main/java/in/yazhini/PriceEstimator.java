package in.yazhini;

public class PriceEstimator {
	public static double BillAmount(String BookName, int NoOfBooks) {
		double TotalAmount = 0;
		if (NoOfBooks > 0 && NoOfBooks <= 10) {
			switch (BookName) {
			// wheather check the book details
			case "TamilNovels": {
				TotalAmount = TamilNovels(NoOfBooks);
				break;
			}
			case "EnglishNovels": {
				TotalAmount = EnglishNovels(NoOfBooks);
				break;
			}
			case "MathematicsDiscoveries": {
				TotalAmount = MathematicsDiscoveries(NoOfBooks);
				break;
			}
			case "GKIndiaAtRisk": {
				TotalAmount = GKIndiaAtRisk(NoOfBooks);
				break;
			}
			default: {
				System.out.println("Please Enter the valid BookName:");
				break;
			}
			}
		} else {
			System.out.println("Enter the valid NoOfBook :");
		}
		return TotalAmount;
	}

	// Generate a Amount.Gst,Delivery charge and Total amount in each BookDetails
	public static double TamilNovels(int A) {
		double amount = (double) (A * 200);
		double GST = (double) 7 * (amount / 100);
		double TotalAmount = GST + amount + 50;
		System.out.println("Total amount of TamilNovels = " + TotalAmount);
		return TotalAmount;

	}

	public static double EnglishNovels(int B) {
		double amount = (double) (B * 250);
		double GST = (double) 7 * (amount / 100);
		double TotalAmount = GST + amount + 50;
		System.out.println("Total amount of EnglishNovels = " + TotalAmount);
		return TotalAmount;
	}

	public static double MathematicsDiscoveries(int C) {
		double amount = (double) (C * 300);
		double GST = (double) 7 * (amount / 100);
		double TotalAmount = GST + amount + 50;
		System.out.println("Total amount of MathematicsDiscoveries = " + TotalAmount);
		return TotalAmount;
	}

	public static double GKIndiaAtRisk(int D) {
		double amount = (double) (D * 350);
		double GST = (double) 7 * (amount / 100);
		double TotalAmount = GST + amount + 50;
		System.out.println("Total amount of GKIndiaAtrisk = " + TotalAmount);
		return TotalAmount;
	}
}
