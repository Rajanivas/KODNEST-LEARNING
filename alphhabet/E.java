package alphhabet;

public class E {

	public static void main(String[] args) {
              int n = 6;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
            	if(j == 0||i == 0 || i == n/2 || i == n) {
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
