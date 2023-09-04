package alphhabet;

public class J {

	public static void main(String[] args) {
            int n = 6;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
            	if(i==0 || (j==5/2 && i<6) || i == 6 && j<=1 ) {
            		System.out.print("*");
            	}
            	else {
            		System.out.print(" ");
            	}
            }
            
            System.out.println();
            }
	}

}
