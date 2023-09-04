package alphhabet;

public class H {

	public static void main(String[] args) {
               int n = 6;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
            	if(i==n/2 || j == 0 || j== 4) {
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
