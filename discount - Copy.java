package programs;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the PurchaseAmount: ");
		Double PA = scan.nextDouble();
		checkDiscount(PA);

	}
	public static void checkDiscount(Double PA) {
		if(PA>100.0) {
			System.out.println("Discount Applicable");
		}
		else {
			System.out.println("Not Applicable");
		}
	}

}
