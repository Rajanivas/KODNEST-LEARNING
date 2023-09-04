package alphhabet;

public class U {

	public static void main(String[] args) {
		 int n = 6;
	        
	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j<5; j++) {
	            	if(j==0 || j==4 || (i==6 && j>0 && j<4)) {
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
