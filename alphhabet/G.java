package alphhabet;

public class G {

	public static void main(String[] args) {
         int n = 6;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
            	if(j==0 && (i>0  && i <6) || (i==0 || i == n) && (j >0 && j<4)  || i==n/2 && (j>1 &&  j<6) || j == 4 && (i>3 && i<6)) {
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
