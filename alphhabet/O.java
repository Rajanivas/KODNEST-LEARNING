package alphhabet;

public class O {

	public static void main(String[] args) {
		    int n = 6;
	         
	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j < 5; j++) {
	            	if(i == 0 &&  j>0 && j<4 || (j == 0 && i>0 && i<6) || i == n &&  j>0 && j<4 || (j == 4 && i>0 && i<6)){
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
