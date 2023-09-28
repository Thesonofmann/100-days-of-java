package day23;

import java.util.*;

public class NewList {
    
    public static void main(String[] args){

        LinkedList<String> days = new LinkedList<String>();
        LinkedList<Integer> numbers = new LinkedList<Integer>();


        System.out.println("Advanced loop Techniques");
       // days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        System.out.println(days.getFirst());

        days.addFirst("Sunday");

        System.out.println(days.getFirst());
        System.out.println(days.getLast());
        System.out.println();
        int y = 0;
        
        for (String x : days){
            
            numbers.add(y+1);
            System.out.println(numbers.get(y));
            y++;
        }
        
        
        
        System.out.println(y);

        System.out.println("There are " +y + " days ina week, and they are: ");

        for (int t = 0; t <y; t++){         //still no = here, its just<
            System.out.println(days.get(t));
        }
    }
}
