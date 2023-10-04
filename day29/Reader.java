package day29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args){

        //READING a File
        try {
            File myFirstFile = new File("myFirstFile.txt");
            Scanner myReader = new Scanner(myFirstFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                System.out.println("SUCCESSFUL!");
            }


        } catch (FileNotFoundException e) {
            System.out.println("An error has occured, try again!");
            e.printStackTrace();
        }
   

        //printing out the full details of the file
    File first = new File("myFirstFile.txt");
    if (first.exists()){
        System.out.println("File Name: " + first.getName());
        System.out.println("Absolute path: " + first.getAbsolutePath());
        System.out.println("Readable: " + first.canRead());
        System.out.println("Writeable: " + first.canWrite());
        System.out.println("File size in bytes: " + first.length());
    } else {
        System.out.println("This file does not exist");
    }

   
    }
}
