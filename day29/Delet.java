package day29;

import java.io.File;

public class Delet {
    public static void main(String[] args){
        //DELETE A FILE
        
        File second = new File("C:\\Users\\Jerry\\Documents\\mySecondFile.txt");
        if (second.delete()){
            System.out.println("Succesfully deleted: " + second.getName());
        } else {
            System.out.println("Failed to delete this file");
        }

        // DELETE A FOLDER
        //Same as above code for deleting a file, exception: new file directory wold be a folder not a file


    }

}
