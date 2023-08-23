package method;

public class Demo {

	public static void main(String[] args) {
		
		add();
		
		int a = 10;
		int b = 10;
		int res = mul(a,b);
		System.out.println(res);
		
		int res1 = avg(a,b);
		System.out.println(res1);
		
		boolean res2 = Greater(a,b);
		System.out.println(res2);
		
	}
	
	public static void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	
	public static int mul(int x, int y) {
		return x*y;
		
	}
	
	public static int avg(int x, int y) {
		return (x+y)/2;
	}
	
	public static boolean Greater(int x, int y) {
		return x == y;
	}

}
