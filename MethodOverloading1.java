package method;
import java.util.Scanner;
public class MethodOverloading1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = scan.nextInt();
		square(n);
		
}
	public static void square(int n) {
		for (int i=1; i<n; i++) {
			int res = i*i;
			System.out.println("The square of "+i+"is " +res);
		    if(i==9) {
			    break;
			    
		    }
		    
		}
	}
}
