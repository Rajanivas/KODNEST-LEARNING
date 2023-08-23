package programs;

import java.util.Scanner;

public class polygonIdentifier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sides = scan.nextInt();
		IdentifyPolygon(sides);

	}
	public static void IdentifyPolygon(int sides) {
		switch(sides) {
		
		
		case 3:
			System.out.println("include triangle");
			break;
			
		case 4:
			System.out.println("Quadrilateral");
			break;
			
		case 5:
			System.out.println("Pentagon");
			break;
			
		case 6:
			System.out.println("Hexagon");
			break;
			
		default:
			System.out.println("Polygon");
			break;
		
		
		}
	}

}
