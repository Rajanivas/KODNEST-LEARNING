package alphhabet;

public class K {

	public static void main(String[] args) {
         int n = 6;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
            	if(j==0 || i == 4-j || i == 2 + j  ) {
            		System.out.print(" *");
            	}
            	else {
            		System.out.print(" ");
            	}
            }
            
            System.out.println();
            }
	}

}
