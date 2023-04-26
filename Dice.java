
//importing packages 
import java.util.Scanner;
import java.util.Random;


public class Dice {

	public static void main(String[] args) {
		
		
		// Creating user input
		Scanner scan = new Scanner(System.in);
		//Creating random number generator
		Random rand = new Random();
		
		
		//Creating random Dice Roll
		int randomNumber = rand.nextInt(5) + 1;
		
		// asking user to press one to roll die
		
		System.out.println ("Player, press 1 and enter to roll the die!");
		
		int choose = scan.nextInt();
		
	
		// If / else statement
			if (randomNumber == 1) {
			System.out.println("The die has rolled the number: " + randomNumber);
		}
			else if (randomNumber == 2) {
			System.out.println("The die has rolled the number: " + randomNumber);
		}
			else if (randomNumber == 3) {
			System.out.println("The die has rolled the number: " + randomNumber);
		}
			else if (randomNumber == 4) {
			System.out.println("The die has rolled the number: " + randomNumber);
		}
			else if (randomNumber == 5) {
			System.out.println("The die has rolled the number: " + randomNumber);
		}
		else {
			System.out.println("To roll the die, please press the number 1 and enter!");
		}

	}

}
