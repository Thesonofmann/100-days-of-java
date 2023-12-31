package day18_19_20;
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
        String java101;
        String mongodb101;

        
       
        

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
        java101 ="JAVA101";
        mongodb101 = "MONGODB101";
        // isRegisteredJava = registeringcourseID.equals(java101);
        
    }
     // abstract methods: methods with empty bodies, the child class provudes the body after inheritance 
    
    public void courseStudentAssign(){
        
                    
    
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
        public String getCourses(){
            return java101 + " " + mongodb101;
    
        }
    
              
        public void newRegistration(String studentName, int studentAge, String registeringcourseID){
                
                totalStudentsCount++;
                System.out.println("Student nanme is " + studentName);
                System.out.println("You are " + studentAge + " years old");
                System.out.println("Reg courseID: " + registeringcourseID);
                System.out.println();
               
                if (registeringcourseID.equalsIgnoreCase(java101)){
                    noOfJavaStudents++;
                }
                else { noOfMONGODBStudents++;

                }
                System.out.println("There are: " + noOfJavaStudents + "Java Students currently registered");
                System.out.println();
                System.out.println("There are: " + noOfMONGODBStudents + "MongoDB students currently registered");

                // School.StudentClassAssign.courseStudentCount();
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
    //  public void courseStudentCount(){
            
    //     for (int i = 1; i <= totalStudentsCount; i++){
    //             System.out.println(Student.class..registeringcourseID);
    //          if (registeringcourseID== "Java101"){
    //              noOfJavaStudents++;
    //              System.out.println();
    //         }
    //          System.out.println("There are " + noOfJavaStudents + " students in Java Class");
    //     }
    // }
}
        class MongoDBClass extends School{

        public MongoDBClass() {
          //  super(teacherName, noOfStudents, courseID, courseName);
            courseID = "MONGO101";
            courseName = "MongoDB";
            teacherName = "Mr Daniel";
            noOfStudents= 24;
        }
//         public void courseStudentCount(){


//             System.out.println("There are " + noOfMONGODBStudents + " students in Mongo Class");
//    }
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

        student5.newRegistration("Thelma Oy", 21, "mongodb101");
        student6.newRegistration("Uzo Maneeey", 11, "java101");
        student7.newRegistration("Joshua Crypto", 20, "java101");
        student8.newRegistration("Ada Ada", 22, "mongodb101");

        System.out.println(niit.totalStudentsCount);
        System.out.println(niit.noOfJavaStudents);
        System.out.println(niit.noOfMONGODBStudents);
        // class1.courseStudentCount();
        // class2.courseStudentCount();
        System.out.println();
        System.out.println(niit.totalStudentsCount);


    }
}
