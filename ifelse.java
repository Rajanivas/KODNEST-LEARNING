package programs;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.println("Enter the number1");
		int num1 = scan.nextInt();
		System.err.println("Enter the number2");
		int num2 = scan.nextInt();
		System.err.println("Enter the number3");
		int num3 = scan.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("num1 is greater");
		}
		else if(num2>num3 && num2>num1){
			System.out.println("num2 is greater");
		}
		else {
			System.out.println("num3 is greater");
		}
		
	}

}
