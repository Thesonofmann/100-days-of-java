package day23;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    //How to import and use an arrayList. Different from a regular array

    public static void main(String[] args){
    
    ArrayList<String> instruments =  new ArrayList<String>();
    instruments.add("Piano");
    instruments.add("Guitar");
    instruments.add("Drums");
    instruments.add("Violin");

    System.out.println(instruments);
    
    instruments.set(0, "Talking Drum"); //changes the element of index 0

    System.out.println();
    System.out.println(instruments);
    System.out.println();

    System.out.println(instruments.get(3));
    System.out.println();

    System.out.println(instruments.size());    //returns the .length of the arrayList

    for (String x : instruments){
        System.out.println("I can play the " + x);

    } 
    System.out.println();
    Collections.sort(instruments);
    //Second loop method
    System.out.println();
    for (int i=0; i<instruments.size(); i++){ //note that there is no = in the middle condition only < because index and length are not the same
        System.out.println("I can still play the " + instruments.get(i));
    }








    }


}
