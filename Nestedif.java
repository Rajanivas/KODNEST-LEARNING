package programs;

public class Nestedif {

	public static void main(String[] args) {
		int temperature = 31;
        boolean isRainy = false;

        if (temperature > 30) {
            System.out.println("It's hot outside. Wear light and breathable clothes.");
            if (isRainy) {
                System.out.println("Don't forget to carry an umbrella.");
            }
        }

	}

}
