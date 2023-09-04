package alphhabet;

public class Q {

	public static void main(String[] args) {
		int n = 11;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j<=n; j++) {
            	 
            	if( j== 0 && i<10 && i>=0 || i==9 && j>=0 && j<10 || j== 9 && i<10 && i>=0||i==j && i+j>n/2-1 || i==0 && j<10){
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
