package day36;

import java.util.Arrays;
//Varargs
//Create a method that collects a shopping items list

public class Main {
    static void shoppingItems(String...items){
        System.out.println(Arrays.toString(items));
     }
    public static void main(String[] args){
    
        shoppingItems("gas", "bread", "milo", "egusi", "coffee", "charger", "bags", "belt");
    }


    
}
