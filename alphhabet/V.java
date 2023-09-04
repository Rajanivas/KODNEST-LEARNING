package alphhabet;

public class V {

	public static void main(String[] args) {
		 int n = 7;
	        
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j<7; j++) {
	            	if(  j == n-i-1   || i == j) {
	            		System.out.print("* ");
	            	}
	            	else {
	            		System.out.print(" "+" ");
	            	}
	            }
	            
	            System.out.println();
	            }

	}

}
