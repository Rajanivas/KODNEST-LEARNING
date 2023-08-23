package programs;

import java.util.Scanner;

public class distancecal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the speed");
		Double speed = scan.nextDouble();
		System.out.println("Enter the time");
		Double time = scan.nextDouble();
		
		Dsitancecalculator D = new Dsitancecalculator();
		System.out.println(D.Distancecalculator(speed, time));
		
		Dsitancecalculator D1 = new Dsitancecalculator();
		System.out.println(D.Distancecalculator1(speed, time));
		
		Dsitancecalculator D2 = new Dsitancecalculator();
		System.out.println(D.Distancecalculator2(speed, time));
		
		
		
		
		
		
	}

}
