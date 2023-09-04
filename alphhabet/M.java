package alphhabet;

public class M {

	public static void main(String[] args) {
         int n = 6;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
            	if(j == 0  || j ==4 || (i==j || i+j == 4) && i<3) {
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
