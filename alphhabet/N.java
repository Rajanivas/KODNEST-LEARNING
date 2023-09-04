package alphhabet;

public class N {

	public static void main(String[] args) {
		 int n = 6;
	        
	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j < 7; j++) {
	            	if(j == 0  || j ==6 || i==j  ) {
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
