package alphhabet;

public class R {

	public static void main(String[] args) {
		 int n = 6;
	        
	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j<5; j++) {
	            	if(j == 0 && i<6  || (i == 0 && j<4) || i== 3 && j<4 || j==4&& (i>0 && i<3) || i==4  && j<4 && j>2 || i==5  && j<5 && j>3) {
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
