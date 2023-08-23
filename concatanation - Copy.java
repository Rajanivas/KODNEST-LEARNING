package programs;
import java.util.Scanner;
public class concatanation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two strings");
		String a = scan.next();
		String b = scan.next();
		System.out.println(concatanation(a,b));
	}
	
	public static String concatanation(String a, String b) {
		
		return a + b;
		
	}

}
