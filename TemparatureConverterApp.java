package programs;
import java.util.Scanner;
public class TemparatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fahrenheit ");
		Double fahrenheit = scan.nextDouble();
		TemparatureConverter t= new TemparatureConverter();
		Double celcius = t.convertFahrenheitToCelsius(fahrenheit);
		
		System.out.println(celcius);
		
		

	}

}
