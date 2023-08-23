package programs;

public class constructor {
	String color;
	int cost;
	String brand;


//constructor
public constructor(String x, int y, String z) {
	color = x;
	cost = y;
	brand = z;
}


public void drive() {
	System.out.println("the car color is" + color + "and is "+ brand+ "and cost is" + cost);
}

public void breake() {
	System.out.println("the car have break");
}
}
