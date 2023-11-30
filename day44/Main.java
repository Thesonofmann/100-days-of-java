package day44;

import java.util.Scanner;




public class Main {

	public static void main(String[] args) {


		/*
		 * accept basic salary (BS)
		 * HRA = 50% of BS
		 * SpecialAllowance = 75% of BS
		 * PF deduction = 12% of BS
		 * Net payable salary = HRA + Special ALlowance - PF deduction
		 * 
		 */
	
		System.out.println("Input Basic Salary to determine Net Payable Salary");
		Scanner in = new Scanner(System.in);
		double basicSalary = in.nextDouble();
		double hra = basicSalary * 0.5;
		double specialAllowance = basicSalary * 0.75;
		double pfDeduction = basicSalary * 0.12;
		double netPayable = hra + specialAllowance - pfDeduction;
		
		System.out.println("The net payable salary is " + netPayable);
		
	
	
	}
	
	

}
