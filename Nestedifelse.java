package programs;

public class Nestedifelse {

	public static void main(String[] args) {
		boolean hasPassport = true;
        double budget = 1500;

        if (hasPassport) {
            System.out.println("You have a passport.");
            
            if (budget >= 2000) {
                System.out.println("You can consider an international vacation.");
            } 
            else {
            System.out.println("You don't have a passport.");
            System.out.println("You might need to apply for a passport first.");
            }
        }
        else {
        	System.out.println("Nothing");
        }

	}

}
