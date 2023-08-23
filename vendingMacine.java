package programs;

import java.util.Scanner;

public class vendingMacine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String product = scan.nextLine();
		getProduct(product);

	}
	
	public static void getProduct(String product) {
		if(product == "P01") {
			 System.out.println("Coca Cola");
		}
		else if(product == "P02") {
			System.out.println("pepsi");
		}
		
		else if(product == "P03") {
			System.out.println("fanta");
		}
		else if(product == "P04") {
			System.out.println("pepsi");
		}
		else if(product == "P05") {
			System.out.println("Jaljeera");
		}
		else if(product == "P06") {
			System.out.println("Mountain Dew");
		}
		
		else if(product == "P06") {
			System.out.println("BoatGuava");
		}
		
	}

}
