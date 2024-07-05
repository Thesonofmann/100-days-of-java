package day52;

public class Main {
    package Projects;

import java.util.Scanner;

public class Hangman {
	/*
	 * 
	 * Accept Letter input from User
	 * 
	 * Compare input to current word
	 * 
	 * If input is valid(present in the current word) DISPLAY LETTER
	 * i.e Cover HIPPOPOTAMUS with * and for every correct letter guessed, you reveal what is behind the *....DONE
	 * if not present.....X...5X cancels the game
	 * 
	 * step 1: 
	 */
	
	public void startGame() {	
		Scanner in= new Scanner(System.in);
		String word = "HIPPOPOTAMUS";
		String display = "************";
		StringBuffer str = new StringBuffer(display);
		System.out.println("--- " + str + " ---");
		System.out.println("FILL THE MISSING LETTERS");
	while (true) {
			
		for (int x=4; x>=0;) {
			String guessedLetter = in.nextLine();
			char letter = guessedLetter.charAt(0);
			if (letter=='H' || letter== 'h') {
				str.setCharAt(0, 'H');
				System.out.println("--- " + str + " ---");
			}
			else if (letter=='I' || letter == 'i') {
				str.setCharAt(1, 'I');
				System.out.println("--- " + str + " ---");
			}
			else if (letter=='P' || letter == 'p') {
				str.setCharAt(2, 'P');
				str.setCharAt(3, 'P');
				str.setCharAt(5, 'P');
				System.out.println("--- " + str + " ---");
			}
			else if (letter=='O' || letter == 'o') {
				str.setCharAt(4, 'O');
				str.setCharAt(6, 'O');
				System.out.println("--- " + str + " ---");
			}
			else if (letter=='T' || letter == 't') {
				str.setCharAt(7, 'T');
				System.out.println("--- " + str + " ---");
			}
			else if (letter=='A' || letter == 'a') {
				str.setCharAt(8, 'A');
				System.out.println("--- " + str + " ---");
			}
			else if (letter=='M' || letter == 'm') {
				str.setCharAt(9, 'M');
				System.out.println("--- " + str + " ---");
			}
			else if (letter=='U' || letter == 'u') {
				str.setCharAt(10, 'U');
				System.out.println("--- " + str + " ---");
			}
			else if (letter=='S' || letter == 's') {
				str.setCharAt(11, 'S');
				System.out.println("--- " + str + " ---");
			}
			else {
				System.out.println();
				System.out.println("WRONG LETTER! TRY AGAIN");
				System.out.println(x + " trial(s) left");
				System.out.println("--- " + str + " ---");
			x--;
			}
			}
			System.out.println();
			System.out.println("YOU LOST! BETTER LUCK NEXT TIME");
			System.out.println("THE WORD IS " + word);
			in.close();
			System.exit(0);
	}
	}

	
	public static void main(String[] args) {
		
		Hangman game1 = new Hangman();
		

		Scanner in= new Scanner(System.in);
		System.out.println("--HANGMAN--");
		System.out.println();
		System.out.println("1. PLAY");
		System.out.println("2. VIEW INSTRUCTIONS");
		System.out.println("3. EXIT");
		System.out.println("Select an option");
		String op = in.nextLine();
		char option = op.charAt(0);
		if (option=='1') {
			System.out.println("Let the game begin");//.........GAME START METHOD
			game1.startGame();}
		else if (option=='2') {
			System.out.println("This is the instruction of the game");//............INSTRUCTIONS METHOD
			System.out.println("Only 5 players are allowed");}
		else if (option=='3') {
			System.out.println("Are you sure you want to exit");//...............EXIT THE GAME METHOD
			System.out.println("N to go back to the game, X to exit");
			String exit= in.nextLine();
			char ex = exit.charAt(0);
			if (ex=='N' || ex == 'n') {
				System.out.println("You have chosen to resume playing. Let's gooo");}
			else if (ex=='X' || ex=='x') {
				System.out.println("Goodbye player. See you soon");
				System.out.print("Disclaimer:");
				System.out.print(".");
				System.out.print(".");
				System.out.print(".");
				System.out.print(".");
				System.out.println("No human beings were  hung in the making of this game");}
				else	System.out.println("Wrong input....BYE!");}
			else {
				System.out.println("INPUT A VALID OPTION");}
		
		
		in.close();	
		
		

	}

}

    
}
