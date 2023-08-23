package programs;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		prime(n);

	}
	public static void prime(int n) {
		boolean isPrime = true;
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println(n + " number is a prime number ");
		}
		else {
			System.out.println(n + " number is not a prime number");
		}
	}

}
