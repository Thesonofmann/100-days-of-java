package day18;
    // Abstract Class and Methods Pt2 //Check day9 for pt1
    
    //abstract class cannot be accessed by creating an object, they have to be inherited by another class....N:B the parent class in day17.main is a good example that could be converted into an abstract class


abstract class School{
        int totalStudentsCount;
        String teacherName;
        int noOfStudents;
        String courseID;
        String courseName;
        String studentName;
        int studentAge;
        String matricNo;
        String registeringcourseID;
        int noOfJavaStudents;

 public School(){
        noOfJavaStudents= 0;
        teacherName= "Name of teacher";
        courseID = "Course ID goes here";
        noOfStudents = 0;
        courseName = "Name of the Course";
        totalStudentsCount = 0;
        studentName = "Name of new student";
        studentAge = 0;
        matricNo = "Enter Matric No";
        registeringcourseID = "Enter Course ID";
    }
   
   // abstract methods are empty body methods i.e their methods are provided by the subclass that inherits them

    abstract void studentCourseCount();

}
class JavaClass extends School{
    public void studentCourseCount(){
        for (int i = 1; i <= totalStudentsCount; i++){
             if (registeringcourseID== "Java101"){
                 noOfJavaStudents++;
                 System.out.println();
            }
             System.out.println(noOfJavaStudents);
        }
    }
}
    

    //use this new knowledge to create methods to solve the issues encountered on day17

public class Main {
    


}
