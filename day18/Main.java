package day18;
    // Abstract Class and Methods Pt2 //Check day9 for pt1
    
    //abstract class cannot be accessed by creating an object, they have to be inherited by another class...then an object of said class will be created....N:B the parent class in day17.main is a good example that could be converted into an abstract class i.e

//from day17.main
 class School{ 
        String studentName;
        String registeringcourseID;
        boolean isRegisteredJava;
        boolean isRegisteredMongoDB;
        int totalStudentsCount;
        int noOfStudents;
        int noOfJavaStudents;
        int noOfMONGODBStudents;
        String courseID;
        String courseName;
        String teacherName;
        int studentAge;
        String matricNo;
        
       
        

 public School(){
        noOfJavaStudents = 0;
        noOfMONGODBStudents = 0;
        teacherName= "Name of teacher";
        courseID = "Course ID goes here";
        noOfStudents = 0;
        courseName = "Name of the Course";
        totalStudentsCount = 0;
        studentName = "Name of new student";
        studentAge = 0;
        matricNo = "Enter Matric No";
        registeringcourseID = "Enter Course ID";
        isRegisteredJava = registeringcourseID.equals("JAVA101");
         if (isRegisteredJava= true){
         noOfJavaStudents++;   
        }
        isRegisteredMongoDB = registeringcourseID.equals("MongoDB101");
        if (isRegisteredJava = true){
        noOfMONGODBStudents++;}
    }

     public void classTeacher(){
        System.out.println("The teacher of this class is " + teacherName);
    }
        public void studentCount(){
        System.out.println("There are " + noOfStudents + " students in this class");
    }
        public void courseName(){
        System.out.println("The name of the course is " + courseName); 
    }
        
    // Inner Class, added on day 17, change this to abstract 
     class Student{
        
              
        public void newRegistration(String studentName, int studentAge, String registeringcourseID){
                
                totalStudentsCount++;
            }
   
   // abstract methods: methods with empty bodies, the child class provudes the body after inheritance 
    abstract class studentCount{
    abstract void courseStudentCount();
    }
}
 }
class JavaClass extends School{
        public JavaClass() {
            courseID = "Java101";
            courseName= "Java";
            teacherName = "Mr Timson";
  
     }
        // Body of abstract method // trying to solve for the no of studdents that register for this particular class
    public void courseStudentCount(){
            
        for (int i = 1; i <= totalStudentsCount; i++){
                System.out.println(registeringcourseID);
             if (registeringcourseID== "Java101"){
                 noOfJavaStudents++;
                 System.out.println();
            }
             System.out.println("There are " + noOfJavaStudents + " students in Java Class");
        }
    }
}
        class MongoDBClass extends School{

        public MongoDBClass() {
          //  super(teacherName, noOfStudents, courseID, courseName);
            courseID = "MONGO101";
            courseName = "MongoDB";
            teacherName = "Mr Daniel";
            noOfStudents= 24;
        }
        public void courseStudentCount(){


            System.out.println("There are " + noOfMONGODBStudents + " students in Mongo Class");
   }
    }

public class Main {
    public static void main(String[] args){
        School niit = new School();
        School.Student student1 = niit.new Student();

        student1.newRegistration("Jeremiah", 22, "Java101");
        
        
        System.out.println(niit.totalStudentsCount);

        School.Student student2 = niit.new Student();
        student2.newRegistration("Emma", 18, "MongoDB101");

        

        System.out.println(niit.totalStudentsCount);
        System.out.println();
        System.out.println();

       // niit.noOfJavaStuds();
        
       
       
       
       
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
        
       // System.out.println("The number of students in Java class are " + niit.noOfJavaStudents);

        School class3 = new School();
        System.out.println();
        System.out.println("Third Class a.k.a Parent Class");
        class3.courseName();
        class3.classTeacher();
        class3.studentCount();

        System.out.println("Day18 testing");
        School.Student student3 = niit.new Student();
        student3.newRegistration("Name1", 32, "MongoDB101");

        School.Student student4 = niit.new Student();
        student4.newRegistration("Name4", 26, "MongoDB101");

        School.Student student5 = niit.new Student();
        School.Student student6 = niit.new Student();
        School.Student student7 = niit.new Student();
        School.Student student8 = niit.new Student();

        System.out.println(niit.totalStudentsCount);
        System.out.println(niit.noOfJavaStudents);
        System.out.println(niit.noOfMONGODBStudents);
        class1.courseStudentCount();
        class2.courseStudentCount();
        System.out.println();


    }
}
