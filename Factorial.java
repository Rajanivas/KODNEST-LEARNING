package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		factorialnum(n);

	}
	public static void factorialnum(int n) {
		int p = 1;
		for(int i=1; i<=n; i++) {
			p = p *i;
			
		}
		System.out.println(p);
	}

}
