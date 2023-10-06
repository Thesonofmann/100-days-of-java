package day30;

import java.util.Scanner;

class Formulas {
    static int x;
    static int y;
    static int z;
    static int sum;
    static int multiply;

    static void addition(int x, int y){
        sum = x + y;
        System.out.println(sum);
    }
    static void multiplication(int x, int y){
        multiply = x * y;
        System.out.println(multiply);
    }
}


public class Main extends Formulas {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("input two numbers to multiply and hit enter after each one");
        multiplication(input.nextInt(), input.nextInt());
        System.out.println("Operation Successful");
        System.out.println(); System.out.println(); System.out.println();

        System.out.println("to add two numbers together, input the numbers and hit enter after each input");
        addition(input.nextInt(), input.nextInt());
        System.out.println("Success");


        
    }
    
}
