package day47;

//import java.util.Scanner;
/* Write a java code to remove duplicates from strings
 * 
 * 
 * Write a java program to check if a word contains a letter of your choice
 * 
 * accept a string
 * iterate over each index of the string
 * if 
// if check char == charat(x), stringbuffer.indexof
 */

public class Main {
	
	public static String remove_duplicate(String word) {
		
		String noDuplicate = "";
		
		for (int i=0; i<word.length(); i++) {
			
			String value = String.valueOf(word.charAt(i));
			if (!noDuplicate.toLowerCase().contains(value.toLowerCase())) {
				noDuplicate += value;
			} else {
				continue;
			}
		}
		
		return noDuplicate;
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Main.remove_duplicate("Nifemi"));
		System.out.println(Main.remove_duplicate("Wagwan"));
		System.out.println(Main.remove_duplicate("abracadabra"));
		System.out.println(Main.remove_duplicate("Strings"));
		
		
		
		
//		Scanner in = new Scanner(System.in);

//		System.out.println("Input a String");
//		String word = in.nextLine();
//		System.out.println("The String you want to remove duplicates from is " + word);
//		
//		StringBuffer bf = new StringBuffer(word);
////	cont:	for (int i=0; i<bf.length(); i++) {
//			
//			for (int x=0; x<bf.length();x++) {
//			
//				char checkchar = bf.charAt(x);
//				System.out.println(bf.lastIndexOf(word));
//				
//				if (checkchar ==bf.charAt(x)) {
//					
////					bf.deleteCharAt(x);
////					continue cont;
////				}
//			
//		}
//			System.out.println(bf);
//		}
//		
//		
//
//		
//		
//		System.out.println(bf);
		
		
		
	}

}
