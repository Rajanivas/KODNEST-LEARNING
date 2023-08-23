package programs;

public class constructor1 {

	public static void main(String[] args) {
		constructor car = new constructor("red", 2500000,"audi");
		System.out.println(car.color);
		System.out.println(car.cost);
		
		car.drive();
		car.breake();
		
		

	}

}
