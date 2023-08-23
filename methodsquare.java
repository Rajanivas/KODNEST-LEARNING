package method;

public class methodsquare {
	
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			
			int res = Square(i);
			System.out.println(res);
		}
	}
	static  int Square(int x) {
		int res = x*x;
		return res;
	}
	

}
