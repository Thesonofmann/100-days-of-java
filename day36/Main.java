package day36;

import java.util.Arrays;
//Varargs
//Create a method that collects a shopping items list


public class Main {
    static void shoppingItems(String...items){ //This can either be used as the only argument or the last argument
        System.out.println(Arrays.toString(items));
     }
    public static void main(String[] args){
    
        shoppingItems("gas", "bread", "milo", "egusi", "coffee", "charger", "bags", "belt");
         someMethod("str", 42, 10, 17.23, 4, 23.22, 26, 454, 45666.4, 4564.45, 465758.45);

        }

        private static String someMethod(String s, int i, double... arr){
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]); //prints: 10.0, 17.23, 4.0
        return s;
    }



    
}
