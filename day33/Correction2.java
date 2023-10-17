package day33;

import java.util.*;

public class Correction2 {
    public static void main(String[] args){

        int result =0;
        List<List<Integer>> source = List.of(
            List.of(1,2,3,4,6),
            List.of(22,23,24,25),
            List.of(32,33)
        );
        String checked = null;
    cont: for (List<Integer> l: source){
        for (int i: l){
            checked += i + " ";
            if (i>7){
                result = i;
                continue cont;
            }
        }
    }
    System.out.println("result: " + result);
    System.out.println(checked);
    
    }
}
