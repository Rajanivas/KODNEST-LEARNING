package programs;

import java.util.Scanner;

public class evennumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		printEvenNumber(num);

	}
	public static void printEvenNumber(int num) {
		for(int i=1; i<=num; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
