import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// This program will ask user for number between 1 and 100 and return various
		// results
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		String decision = "";
		do {
		
		System.out.println("Hi " + name + ", please enter a number between 1 and 100.");
		int userNum = scan.nextInt();
		if (userNum >= 1 && userNum <= 100) {
		if (userNum % 2 == 0) {
			if (userNum > 60) {
					System.out.println("Number is " + userNum + " and is even.");
			} else if (userNum >= 26) {
				System.out.println("Even");
			} else if (userNum >= 2) {
					System.out.println("Even and less than 25.");
			}
		}
		if (userNum % 2 != 0) {
			if (userNum > 60) {
					System.out.println("Number is " + userNum + " and is odd and over 60.");
			} else {
					System.out.println("Number is " + userNum + " and is odd.");
			}
		}
			System.out.println("Continue?");

			decision = scan.next();

		}

		else {
			System.out.println(name + ", please enter a valid number.");
		}
		} while (decision.equalsIgnoreCase("y"));


		scan.close();
	}

}
