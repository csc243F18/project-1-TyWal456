/*Name: Tyrell Walrond*
Course Code: CSC 243-010
Instructor: Professor DeMarco
Program Purpose: The purpose of this program is to prompt the user for age and amounts saved
					in order to generate an accurate post-retirement savings as an end result
Due Date: September 13, 2018
Filename: retire.java
Time Spent on Project: 2d, 2h*/

/*Java utility imports for user input and necessary math libraries used
					throughout program*/
import java.util.Scanner;
import java.lang.*;

/*Class containing the retire class*/
public class retire {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		/* Variables used */

		int reYears;
		float amount;
		float annBal;
		float total;
		float finalBal;
		// do while structure that loops the user to re-enter the age upon a valid age
		// entry.
		do {
			System.out.println("Enter the amount years left until retirement: "); // Prompting the user to enter in
																					// their age.
			reYears = in.nextInt();

			// If statement used to structure user input
			if (reYears <= 0) {
				System.out.println("Invalid entry, please re-enter!");
			} else if (reYears > 0) {

				// System.out.println("You have " + reYears +" years to retire" );
				System.out.println("\nEnter the balance you can save each year until you retire: ");
				annBal = in.nextFloat();
				total = annBal * reYears;
				amount = (float) 0.05 * total;
				finalBal = (float) total + (float) amount;
				System.out.println("With 5% of interest added on to your pre-retirement savings, you could generate $"
						+ Math.round((float) finalBal) + " by the time you retire.");

			}

		} while (reYears < 0 || reYears == 0);
	}
}// end of program...

// END OF FILE...
