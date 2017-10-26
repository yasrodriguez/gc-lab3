import java.util.Scanner;

/**
 * Prompt the user for an integer. Display a table of squares and cubes from 1
 * to the value entered.
 * 
 * @author Yasmin
 *
 */
public class TableOfPowers {

	/**
	 * Gets a number from the user as long as they want to continue. It passes the
	 * number to a function that performs the calculations and printing.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing = true;
		int userNumber = 0;
		String response = "";

		System.out.println("Learn your squares and cubes!");

		while (keepGoing) {

			System.out.println("Enter an integer: ");

			while (!scan.hasNextDouble()) {
				System.out.println("You must enter an integer. Please try again.");
				scan.next();
			}
			userNumber = scan.nextInt();

			printTableOfPowers(userNumber);

			System.out.println("");
			System.out.println("Continue? (y/n)");
			response = scan.next();
			if (response.equalsIgnoreCase("n")) {
				keepGoing = false;
			}

		}
		scan.close();
	}

	/**
	 * Calculates the square and cubed for 1 to the number provided by the user, and
	 * prints the table.
	 * 
	 * @param number
	 *            the last number to print on the table
	 */
	public static void printTableOfPowers(int number) {

		System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
		System.out.printf("%-10s %-10s %-10s\n", "======", "======", "======");

		for (int i = 1; i <= number; i++) {
			int squared = (int) Math.pow(i, 2);
			int cubed = (int) Math.pow(i, 3);
			System.out.printf("%-10d %-10d %-10d\n", i, squared, cubed);
		}
	}
}
