package programs;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int marks = scan.nextInt();
		System.out.println("Welcome to kodnest");
		checkmarks Marks = new checkmarks();
		Marks.Check();
		
	}

}
