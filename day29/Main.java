package day29;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args){
    try {
        File myFirstFile = new File("myFirstFile.txt");
        if (myFirstFile.createNewFile()) {
            System.out.println("Sucess! File has been created: " + myFirstFile.getName());
        }
            else {
                System.out.println("File already exists");
            }        
        
    } catch (IOException e) {
        System.out.println("An error has occured, try again!");
        e.printStackTrace();
        }
        


        //Creating a new file in a different directory
        try {
            File mySecondFile = new File("C:\\Users\\Jerry\\Documents\\mySecondFile.txt");
            if (mySecondFile.createNewFile()){
                System.out.println("Created a new file in Documents directory: " + mySecondFile.getName());
                System.out.println("The directory: " + mySecondFile.getAbsolutePath());
            } else{
                System.out.println("This file/folder already exists");
            }

        } catch (IOException e) {
            System.out.println("An error has occured, try again!");
            e.printStackTrace();
        }

        //Writing To a File
        try {
            FileWriter myWriter = new FileWriter("myFirstFile.txt");
            myWriter.write("I hear files in Java is tricky but fun, well I'm here for the fun experience");
            myWriter.close();
            System.out.println("Successfully wrote my first note to a file");
            
        } catch (IOException e) {
            
            System.out.println("An error occured, try again!");
            e.printStackTrace();
        }
        
        


    }
}
