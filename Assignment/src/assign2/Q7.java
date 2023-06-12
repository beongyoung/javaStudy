package assign2;
/**
 * The program Q7
 * This program > rock, scissors, paper만 입력 가능한 가위바위보 게임
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// Define the game options
		String[] options = { "scissors", "rock", "paper" };

		// Get user's choice
		Scanner scanner = new Scanner(System.in);
		String userChoice = "";
		boolean validInput = false;
		while (!validInput) {
			System.out.println("Please enter your choice (scissors, rock, or paper):");
			userChoice = scanner.nextLine();
			try {
				if (!isValidChoice(userChoice, options)) {
					throw new Exception();
				}
				validInput = true;
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter one of the following options: scissors, rock, or paper.");
			}
		}

		// Generate computer's choice
		int computerChoiceIndex = (int) (Math.random() * 3);
		String computerChoice = options[computerChoiceIndex];

		// Determine the winner
		String result = "";
		if (userChoice.equals(computerChoice)) {
			result = "It's Dual";
		} else if (userChoice.equals("scissors") && computerChoice.equals("paper")
				|| userChoice.equals("rock") && computerChoice.equals("scissors")
				|| userChoice.equals("paper") && computerChoice.equals("rock")) {
			result = "You win!";
		} else {
			result = "Computer wins!";
		}

		// Print out the result
		System.out.println("Your choice: " + userChoice);
		System.out.println("Computer's choice: " + computerChoice);
		System.out.println(result);
	}

	private static boolean isValidChoice(String choice, String[] options) {
		for (String option : options) {
			if (option.equals(choice)) {
				return true;
			}
		}
		return false;
	}
}