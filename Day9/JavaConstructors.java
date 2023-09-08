package Day9;

import java.time.LocalDate;
import java.util.Arrays;

public class JavaConstructors {
    int y;
    int[] x= new int[5];
    LocalDate studentD_O_B = LocalDate.now();
    String studentName;
    int studentAge;

    public JavaConstructors(int age, String name ){
        x[0]= 5;
        x[1]= 4;
        x[2]= 3;
        x[3]= 2;
        x[4]= 1;
        y= 27;
        // Class Constructors Parameters
        studentName= name;
        studentD_O_B = studentD_O_B.minusYears(age);
        studentAge=  age;

        

    }
    public static void main (String[] args){
        JavaConstructors javaConstructors = new JavaConstructors(25, "Joshua Adeniran");
        System.out.println(javaConstructors.y);
        System.out.println(Arrays.toString(javaConstructors.x));
        System.out.println();
        System.out.println(javaConstructors.studentName + " has been successfully registered. You are " + javaConstructors.studentAge + " years old, Born in the year " + javaConstructors.studentD_O_B.getYear());
    }
}
