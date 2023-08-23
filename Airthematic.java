package method;

public class Airthematic {

	public static void main(String[] args) {
		long num1 = 125678;
		long num2 = 9876543210L;
		long res = galacticAddition(num1, num2);
		System.out.println("addition of num1 and num2 is" +res);

	}
	public static long galacticAddition(long num1, long num2) {
		long res = num1 + num2;
		return res;
	}

}
