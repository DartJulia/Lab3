import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// This program will ask user for number between 1 and 100 and return various
		// results
		Scanner scan = new Scanner(System.in);
		// Asks user for name info
		System.out.println("What is your name?");
		String name = scan.nextLine();
		String decision = "";
		// Do loop will allow user to continue entering numbers until indicating
		// otherwise
		do {
		
		System.out.println("Hi " + name + ", please enter a number between 1 and 100.");
		int userNum = scan.nextInt();
			// validates if number entered is in desired range
		if (userNum >= 1 && userNum <= 100) {
				// checks for even number and prints statements based on where it falls in
				// ranges
				if (userNum % 2 == 0) {
			if (userNum > 60) {
					System.out.println("Number is " + userNum + " and is even.");
			} else if (userNum >= 26) {
				System.out.println("Even");
			} else if (userNum >= 2) {
					System.out.println("Even and less than 25.");
			}
		}
				// checks for odd number and prints statements based on where it falls in ranges
		if (userNum % 2 != 0) {
			if (userNum > 60) {
					System.out.println("Number is " + userNum + " and is odd and over 60.");
			} else {
					System.out.println("Number is " + userNum + " and is odd.");
			}
		}
				// Prompts user to continue or not
				System.out.println("Continue? (y/n)");

			decision = scan.next();

		}
			// executes if number is not in valid range
		else {
			System.out.println(name + ", please enter a valid number.");
		}
		} while (decision.equalsIgnoreCase("y"));

		System.out.println("Goodbye"); // end program
		scan.close();
	}

}
