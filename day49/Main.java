package day49;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        //Multi- Dimensional Array
        // Create a multi-dimensional of students in your class and lecturers


        // initializing a string multi d array
        String [] [] niit = {{"Mr Daniel", "Mr Timson", "Miss(Mrs soon) Praise"}, {"Jamaal", "Teddi Wizzy", "Kayode", "Adaugo", "Nifemi","Emmanuel", "Thelma", "Lex"}};

        System.out.println(Arrays.deepToString(niit));
        
        System.out.println(niit[0][2]);

        // initializing an integer array using the 
        int [] [] multi_array = new int [2] [4];
        multi_array[0][0] = 5;
        multi_array[0][1] = 15;
        multi_array[0][3] = 22;
        multi_array[0][2] = 657;
        multi_array[1][0] = 251;
        multi_array[1][1] = 12;
        multi_array[1][2] = 131;
        multi_array[1][3] = 00;


        System.out.println(Arrays.deepToString(multi_array));

        //Looping through a multi dimensional array
        for (int i = 0; i< multi_array.length; i++) { //the first loop required for a multi- d array

            for (int j =0; j<multi_array[i].length; j++) { //the second loop required for a multi- d array
                System.out.println(multi_array[i][j]);
            }
        }

        System.out.println("for each loop");
    
        for (int[] i: multi_array) {
            for (int j: i) {
                System.out.println(j);
            }
        }
    }
}
