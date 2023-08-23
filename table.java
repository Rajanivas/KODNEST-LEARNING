package programs;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		printTable(value);
	}
	
	public static void printTable(int value) {
		for(int i=1; i<=10; i++) {
			System.out.println(value * +i+="");
		}
	}

}
