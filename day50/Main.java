package day50;

import java.util.Scanner;

public class Main {

		void throw_error() {
			System.out.println("Using the throw keyword");
			throw new ArithmeticException();
		}
		public static void main(String[] args) {
			
			Main errh = new Main();
			
			try {
				errh.throw_error();
			} catch (ArithmeticException a) {
				System.err.println("Error occured in the methods " + a.getMessage());
			}
			
			try {
				System.out.println(5/0);
				
			} catch (ArithmeticException art) {
				System.err.println("Error raised because " + art.getMessage());
			} catch (ArrayIndexOutOfBoundsException arr) {
				
			} finally {
				System.err.println("I don try :(");
			}
			
			
//			try with resource
			try (Scanner sc = new Scanner(System.in)) {
				
			}
		
	}

}
