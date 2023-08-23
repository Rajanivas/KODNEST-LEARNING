package method;

public class FanApp {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		Fan f3 = new Fan();
		
		f1.Wings = 3;
		f1.color = "white";
		f1.brand = "crompton";
		f1.cost = 3000;
		
		f1.Rotate();
		f1.BlowAir();
		
		System.out.println("Fan wings ="+f1.Wings + " ," +"Fan color =" +f1.color+" , "+"Fan brand="+f1.brand+" , "+"Fan Cost ="+ f1.cost);
		
		f2.Wings = 3;
		f2.color = "white";
		f2.brand = "crompton";
		f2.cost = 3000;
		
		f2.Rotate();
		f2.BlowAir();
		
		System.out.println("Fan wings ="+f2.Wings + " ," +"Fan color =" +f2.color+" ,"+"Fan brand="+"Fan brand="+f2.brand+", "+ "Fan Cost ="+f2.cost);
		
		f3.Wings = 3;
		f3.color = "white";
		f3.brand = "crompton";
		f3.cost = 3000;
		
		f3.Rotate();
		f3.BlowAir();
		
		System.out.println("Fan wings ="+f3.Wings + "," +"Fan color =" +f3.color+" ,"+"Fan brand="+f3.brand+", "+ "Fan brand="+f3.cost);

	}

}
