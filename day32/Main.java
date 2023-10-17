package day32;

import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Control Flow");
        String found = null;

        //Creating a List of a list
        List<List<String>> listOfLists = List.of(
          List.of("24", "16", "1", "2", "11"),
          List.of("43", "42", "31", "36", "321"),
          List.of("24", "22", "31", "2", "1")
        );
        //testing break

        System.out.println("\nBreak statement");
        
    exit: for (List<String> l: listOfLists){
        for (String s: l){
            System.out.print(s + " ");
            if (s.contains("3")){
                found = s;
                break exit;
            }
        }
    }
   
    System.out.println("Found: " + found);
    //Testing continue statement
    System.out.println();
    System.out.println("\nContinue statements:");

    String checked = "";
    String found2 = "";
    cont: for(List<String> i: listOfLists){
        for (String s: i){
            System.out.print(s + " ");
            checked += s + " ";
            if (s.contains("3")){
                found2 += s +" ";
                
            }continue cont;
            
        }//continue cont;  //for the entire iterative to perform over and over, the continue has to come at the end of the iterative rather than where the break is invoked...SCRAP THAT
        //we use continue when we want to find only 1 literal, to find multiple literals, we let the iterative run without a break or continue.......SCRAP THAT....check day33.correction2
    }
    System.out.println();
    System.out.println("We checked the following numbers: " + checked); 
    System.out.println("And found the ff containing the no \"3\": " + found2); 



    }
}
