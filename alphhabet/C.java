package alphhabet;

public class C {

	public static void main(String[] args) {
         int n = 6;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
            	if(((i == 0 || i==6)&& j>0) || ( (j==0 && i>0 && i<6))) {
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
