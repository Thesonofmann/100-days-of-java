package day20;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

class Student{
        String fName;
        String lName;
        String studentName;
        int studentAge;
        LocalDate studentD_O_B;
        String regNo;
        String department;
        String studentClass;
        int rand = ThreadLocalRandom.current().nextInt(2389889);
        int studentsTotal;

    public Student() {
            studentsTotal =0;
        }
        
    
    
    public void setData(String fName, String lName, int studentAge, String department, String studentClass){
        studentsTotal++;
        this.fName = fName;
        this.lName =lName;
        this.studentName = this.fName + " " + this.lName;
        this.studentAge = studentAge;
        this.studentD_O_B = LocalDate.now().minusYears(studentAge);
        this.regNo = ""+ rand;
        this.department = department;
        this.studentClass = studentClass;
        
        System.out.println("Hooray! You have completed your registration");
    }

     public void display(){
        System.out.println("Welcome new Student, get ready for a fun learning experience");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age:  " + studentAge + " years old");
        System.out.println("Student Year of Birth: " + studentD_O_B.getYear());
        System.out.println("Department: " + department);
        System.out.println("Registration No: " + regNo);
        System.out.println("Class: " + studentClass);

        
        System.out.println("There is a total of " + studentsTotal + " students registered"); 


    }
    // class RegComplete{
    //         public String completeReg(){
    //             int schoolFees = 540000;
    //             studentsTotal++;
    //             System.out.println("Hooray, you have completed your registration");
    //             return "You de owe us: " + schoolFees;
    //         }
    //     }

    
}


public class Main {
 
    public static void main(String[] args){

        //Declaring an array of the class Student
        Student[] students;

        //Memory size for the array students
        students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].setData("Jeremiah", "Ashogbon", 22, "Full Stack", "Java101");

        System.out.println();
        students[0].display();
        System.out.println();

        students[1].setData("Ebuka", "Emmanuel", 11, "Software Dev", "MongoDB");

        students[2].setData("Ada", "Paulo", 12, "Web Development", "Logic and Effective Problem Solving");
        
        System.out.println();
        students[1].display();
        System.out.println();
        students[2].display();
        System.out.println();

        //The total no of Students does not increase because I used an array, instead of creating multiple instances of the class Student.

        //Declaring another array
        Student[] students2;
        
        // Initializing tmemory size for the new array
        students2 = new Student[1];

        students2[0] = new Student();

        students2[0].setData("Kay", "Forex", 20, "Forex Trading", "Market Analysis and Strategy");
        
        System.out.println();
        students2[0].display();
        System.out.println();
        
        Student new1 = new Student();
        Student new2 = new Student();
        new1.setData("Student", "One", 11, "New Students", "null");
    
        new2.setData("Second", "Student", 12, "New Students", "Class");
        System.out.println();
        new1.display();
        System.out.println();
        new2.display();
        System.out.println();
    // CONCLUSION: I have no idea why studentsCount++ does not change, I even tried adding both outter and inner class, still the same

    
    }
}
