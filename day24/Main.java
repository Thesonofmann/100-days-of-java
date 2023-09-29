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



        System.out.println("Abia: " + stateAndCapital.get("Abia"));
        System.out.println();

        System.out.println(stateAndCapital);

        System.out.println(stateAndCapital.size());

        //Loop to print Keyset and Value
        for (String x : stateAndCapital.keySet()){
            System.out.println("Key: " + x + ", Values: " + stateAndCapital.get(x));
        }


    
    
    }
}
