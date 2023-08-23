package method;

public class method {

	public static void main(String[] args) {
		greet();
		add();
		
		//second type method//
		int res = sum();
		System.out.println(res);
		
		//3rd type//
		int x = 20;
		int y = 10;
		mul(x,y);
		
		//type 4//
		
		int a = 20;
		int b =10;
		
		int c = div(x,y);
		System.out.println(c);
		

	}
	public static void greet() {
		System.out.println("Name is Raja");
	}
	
	public static void add() {
		System.out.println("Name is Nivas");
	}
	
	public static int sum() {
		int  a = 10;
		int b = 20;
		int res = a+b;
		return res;
		
	}
	
//type 3//
	public static void mul(int x, int y) {
		int res  = x * y;
		System.out.println(res);
		
	}
	
	//type 4//
	public static int div(int a, int b) {
		int c  = a/b;
		return c;
		
	}
	

}
