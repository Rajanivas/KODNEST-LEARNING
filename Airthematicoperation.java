package programs;
public class Airthematicoperation {

	public static void main(String[] args) {
    int num1;
    int num2;
    System.out.println(subtractnumbers(25,15));
    System.out.println(multi(5,5));
    System.out.println(div(25,5));
    System.out.println(rem(15,5));
    
    
	}
	
	public static int subtractnumbers(int num1, int num2) {
		return num1- num2;
		
	}
	
	public static int multi(int num1, int num2) {
		return num1 * num2;
		
	}
	
	public static int div(int num1, int num2) {
		return num1 / num2;
		
	}
	
	public static int rem(int num1, int num2) {
		return num1% num2;
		
	}

}
