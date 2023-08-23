package programs;
import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int temp = number;
        
        do {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        } while (temp > 0);
        
        System.out.println("Sum of digits: " + sum);
	}

}
