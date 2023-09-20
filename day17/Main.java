package day17;

// Java Polymorphism
    // Polymorphism meaning many forms
    // Basically, java polymorphism occurs when you create multiple classes to inherit the attributes and methods from a parent(superclass)



class School{
    String teacherName;
   // String [] registeredStudents;
    int noOfStudents;
    String courseID;
    String courseName;
   // String studentName;
   // String matricNo;
    //String [] courses;

    public School(){

        teacherName= "Name of teacher";
        courseID = "Course ID goes here";
        noOfStudents = 0;
        courseName = "Name of the Course";
    }
    
    // public void lectureDetails(String courseID){
    //     //Create an if statement to print complete course details for course that matches the course ID provided
    // }

    public String classTeacher(){
        System.out.println("The teacher of this class is " + teacherName);
        return"The teacher of this class is " +  teacherName; // this type of method does not print
    }
    public int studentCount(){
        System.out.println("There are " + noOfStudents + " students in this class");
        return noOfStudents; //this type of method does not print
    }
    public String courseName(){
        System.out.println("The name of the course is " + courseName); // this will print
        return courseName;
    }
}
class JavaClass extends School{
    // protected boolean registeredJava; 
    //this should be a method that filters through the courses each student registered. For every yes, noofStudent++

    public JavaClass() {
        //super(teacherName, noOfStudents, courseID, courseName);
        courseID = "Java001";
        courseName= "Java";
        teacherName = "Mr Timson";
        noOfStudents = 12;
        }

        //BODY OF JavaClass
}
    class MongoDBClass extends School{

        public MongoDBClass() {
          //  super(teacherName, noOfStudents, courseID, courseName);
            courseID = "MONGO101";
            courseName = "MongoDB";
            teacherName = "Mr Daniel";
            noOfStudents= 24;


        }
        // Body of MongoDBCLass
    }



public class Main {
    public static void main(String[] args){
        MongoDBClass class1 = new MongoDBClass();
        
        JavaClass class2 = new JavaClass();
        
        System.out.println("First Class");  
        class1.studentCount();
        class1.courseName();
        class1.classTeacher();
        System.out.println();
        
        System.out.println("Second Class");
        class2.courseName();
        class2.studentCount();
        class2.classTeacher();

        School class3 = new School();
        System.out.println();
        System.out.println("Third Class a.k.a Parent Class");
        class3.courseName();
        class3.classTeacher();
        class3.studentCount();
    }
    

}
