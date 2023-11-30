package day44;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		
		// write a program that accepts an input and displays if its even or odd

		Scanner in = new Scanner(System.in);
		System.out.println("Input a number");
		int input = in.nextInt();
		if (input%2==0) {
			System.out.println(input + " is an even number");
		}
		else {
			System.out.println(input + " is an odd number");
		}
		
		in.close();
		
	}

}