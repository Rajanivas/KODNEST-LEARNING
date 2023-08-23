package method;

public class Methodprogram {

	public static void main(String[] args) {
		Float a = 20.4f;
		Float b = 20.5f;
		Float res = a*b;
		System.out.println(res);
		
		int m=20, n =30;
		swap(m,n);
		
		greater();
		

	}
	
	public static void swap(int m, int n) {
		int temp=m;
		m=n;
		n=temp;
		System.out.println("After swap m is"+m+ "and n is" +n);
	}
	
	public static void greater() {
		int a=20,b=9,c=30;
		if (a>b) {
			System.out.println("a is greater");
		}
		if(a>c) {
			System.out.println("a is greater");
		}
		if(b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}
	
	

}
