package alphhabet;

public class I {

	public static void main(String[] args) {
          int n = 6;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
            	if(j==5/2 || i == 0 || i == n) {
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
