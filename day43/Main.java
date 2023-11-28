package day43;

import java.util.Scanner;

public class Main {
    

    public static void main(String[] args){
     
        /*
		 * Hangman Game
		 * 1. Create the class structure
		 * 2. Menu= dispaly 3 OPTIONS
		 * a) PLAY b) VIEW INSTRUCTIONS c) EXIT
		 * MENU: accept input and display it
		 */
		
		System.out.println("HANGMAN");
		System.out.println("Press enter to start");
		Scanner in = new Scanner(System.in);
		String start = in.nextLine();
		System.out.println("a) PLAY");
		System.out.println("b) View Instructions");
		System.out.println("c) Exit");
		System.out.println("Enter a,b or c and hit enter");
		String option = in.nextLine();
		char op = option.charAt(0);
		
		if (op == 'a') {
		System.out.println("This is the game. Start playing");
		// break;
		} else if (op == 'b') {
			System.out.println("This is where we display the instructions of the game");
			// break;
		} else if (op == 'c') {
			System.out.println("Goodbye. Come back soon");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println();
			System.out.println("Disclaimer: No human beings were hanged in the making of this game");
			// break;
		}
		    in.close();
        
    }
}
