package day28;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Twenty8 {
    //Lambda expression(in my own words{inline methods})
    public static void main(String[] args){
        ArrayList<String> participants = new ArrayList<String>();
        
        participants.add("Participant 1");
        participants.add("Seyi Vibes");
        participants.add("Jeremiah Ashogbon");
        participants.add("J.P.K");
        participants.add("Juliet Isreal");
        participants.add("Jessycute");
        participants.add("Thelma");
        participants.add("Ada");
        participants.add("Emma");
        //above is the List of parameters to be inserted in the lambda expression 
        
        participants.forEach((p) -> {
            System.out.println( "The user: " + p + " has subscribed to this challenge");
        });

        //Lambda expressions can also be stored in a variable using Customer java util
        Consumer<String> lambdaVar = (x) -> {
            System.out.println(x);
        };
        System.out.println(); System.out.println("Using lambda expressions as a variable");
        participants.forEach(lambdaVar);

        
        
        //Lambda expression to search for a name and print the name + index value of the object in the ArrayList
        Consumer<String> searchformyName = (m) -> {
        
       if (m.equalsIgnoreCase("Jeremiah ashogbon")){
            String me = m;
            int mee = participants.indexOf(m);
        System.out.println("We found " + me); 
        System.out.println("Index no: "+ mee);
       }
        };
        //call/run the expression for each object on the List
        participants.forEach(searchformyName);

        
    }
    
}
