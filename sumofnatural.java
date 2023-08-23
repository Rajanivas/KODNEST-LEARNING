package programs;

import java.util.Scanner;

public class sumofnatural {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		calculateSum(num);
				;

	}
	public static void calculateSum(int num) {
		int sum=0;
		int i=1;
		while(i<=num) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
	

}
