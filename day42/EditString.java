package day42;
import java.util.Scanner;

public class EditString {

	public static void main(String[] args) {

		System.out.println("Input a String");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String previous_word = "";
		
		
		while (true) {
		System.out.println("Input the change command");
		String change = in.nextLine().toLowerCase();
		char ch = change.charAt(0);
		
		if (ch == 'x') {
			System.out.println("Ended " + input);
			break;
		} else

			if (ch == 'u') {
				previous_word = input;
				input = input.toUpperCase();	
				System.out.println(input);
		} else if(ch == 'l') {
			previous_word = input;
			input = input.toLowerCase();
			System.out.println(input);
		}else if(ch == 'z') {
			input = previous_word;
			System.out.println(input);
		}else if (ch == 'r') {
			previous_word = input;
			StringBuffer bf = new StringBuffer(input);
			input = bf.reverse().toString();
			System.out.println(input);
		}else if (ch == 'c') {  // C= input1.replace(oldchar, newchar)
			
			System.out.println("enter old char sequence");
			String oldchar = in.nextLine();
			System.out.println("enter new char sequence");
			String newchar = in.nextLine();
			input = input.replace(oldchar, newchar);
			System.out.println(input);
			//replacement += newbf.replace(on, to).toString();
		}
			
	}
		in.close();
	}


}
