package method;
import java.util.Scanner;
public class MethodTask {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your name and date of birth");
		String name = scan.next();
		int dob = scan.nextInt();
		method(name);
		int res = method2(dob);
		System.out.println("Your"+" "+res+" "+ "years old.");
		
	}
	
	public static void method(String name) {
		System.out.println("Hello"+" "+ name +"...");
		
	}
	
	public static int method2(int dob) {
		int res = 2023-dob;
		return res;
	}

}
