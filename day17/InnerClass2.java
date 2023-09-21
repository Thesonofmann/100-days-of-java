package day17;

    //Using Inner class to create a student section of day17.main 
    
    class School{
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

        public void classTeacher(){
        System.out.println("The teacher of this class is " + teacherName);
    }
        public void studentCount(){
        System.out.println("There are " + noOfStudents + " students in this class");
    }
        public void courseName(){
        System.out.println("The name of the course is " + courseName); 
    }
        
    //     public void noOfJavaStuds(){
    //         for (int i = 1; i <= totalStudentsCount; i++){
    //             if (registeringcourseID== "Java101"){
    //             noOfJavaStudents++;
    //             System.out.println();
    //         }
    //             System.out.println(noOfJavaStudents);
    //     }
    // }
    // protected boolean registeredJava; 
    //this should be a method that filters through the courses each student registered. For every yes, noofStudent++

    // Inner Class     
    class Student{
              
        public void newRegistration(String studentName, int studentAge, String registeringcourseID){
                totalStudentsCount++;
            }

        }    
    }
    class JavaClass extends School{
    

    public JavaClass() {
        courseID = "Java101";
        courseName= "Java";
        teacherName = "Mr Timson";
        
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
        // Body of MongoDBCLass
       
        // class MongoDBStudents{
        //     int studentCount(){
        //         for ()
        //         if (registeringcourseID== "MONGO101")
        //         noOfStudents++;
        //     }
        // }
    }
            

    public class InnerClass2 {

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

        
    }   


}