import java.util.Scanner;

public class Day4 {
    public static void main(String[] args){
        //Introduce a newStudent and usescanner to accept info for the student
        Scanner in = new Scanner(System.in);
        System.out.println("Dear Student, input in the ff format your");
        System.out.println("First-name");
        System.out.println("Last-name");
        System.out.println("Adress");
        System.out.println("Age");

        newStudent(in.nextLine(), in.nextLine(), in.nextLine(), in.nextInt());
        
        
        in.close();

    }

    static void newStudent(String fname, String  lname, String address, int age){
        System.out.println(fname + " " + lname + " from "+ address + " you are " + age + " years old. Welcome! You're on for a blissful ride" );
    }
}
