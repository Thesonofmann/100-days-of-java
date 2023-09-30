package day24;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

     HashMap<String, String> stateAndCapital = new HashMap<String, String>();
        
        stateAndCapital.put("Abia", "Umauaiha");
        stateAndCapital.put("Adamaya", "Yola");
        stateAndCapital.put("Akwa-Ibom", "Uyo");
        stateAndCapital.put("Anambra", "Akwa");
        stateAndCapital.put("Bauchi", "Bauchi");
        stateAndCapital.put("Bayelsa", "Yenogoa");
        stateAndCapital.put("Borno", "Maiduguri");
        stateAndCapital.put("Cross-River", "Calabar");
        stateAndCapital.put("Delta", "Asaba");
        stateAndCapital.put("Lagos", "Ikeja");



        System.out.println("Abia: " + stateAndCapital.get("Abia"));
        System.out.println();

        System.out.println(stateAndCapital);

        System.out.println(stateAndCapital.size());
        stateAndCapital.remove("Delta");
        System.out.println();
        System.out.println(stateAndCapital);
        System.out.println();

        //Loop to print Key and Value
        for (String x : stateAndCapital.keySet()){ //Declaring all Key Objects as x 
            System.out.println("State: " + x + ", Capital: " + stateAndCapital.get(x)); //printing x(key), and value of the object x
        }

        for (String u : stateAndCapital.keySet()){
            System.out.println(stateAndCapital.get(u));

        } System.out.println(); System.out.println();

        for (String t : stateAndCapital.values()){
            System.out.println(t);
        }




    
    
    }
}
