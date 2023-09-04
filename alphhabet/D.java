package alphhabet;

public class D {

	public static void main(String[] args) {
        int n = 6;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
            	if(j==0|| j == i+1|| i+j == 7 || i*j == 9) {
            		System.out.print("*"+" ");
            	}
            	else {
            		System.out.print(" ");
            	}
            }
            
            System.out.println();
            }

	}

}
