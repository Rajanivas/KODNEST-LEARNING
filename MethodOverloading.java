package method;

public class MethodOverloading {

	public static void main(String[] args) {
		teaBill();
		teaBill1(5);
		teaBill2("Disney");
		teaBill3("Disney",5);
		
	}
	
	public static void teaBill() {
		System.out.println("For one teaBill is 10rs");
	}
	
	public static void teaBill1(int n) {
		System.out.println("no of teas  " + n + " \s cost is" +(n*10));
	}
	
	public static void teaBill2(String type) {
		System.out.println("The cost of "+ type + " \s chai is 15 rs ");
	}
	
	public static void teaBill3(String type, int n) {
		System.out.println("no of tea" + n + "is" +type+ "and total is" +(n*15));
	}

}
