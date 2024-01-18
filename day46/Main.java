package day46;
import java.util.Scanner;

public class Main {

	
	public static boolean contains_Letter() {
		Scanner in = new Scanner(System.in);
		boolean result = false;
		System.out.println("Enter a String");
		String word = in.nextLine();
		System.out.println("Input a letter of your choice");
		char letter = in.next().toLowerCase().charAt(0);
		in.close();
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				result = true;
				break;
			} else {
				result = false;
			}
		}	
		
		return result;
	}
	public static void main(String[] args) {
		
		System.out.println(Main.contains_Letter());


		
	}

}
