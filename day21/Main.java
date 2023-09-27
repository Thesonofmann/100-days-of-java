package day21;

interface Courses{
    public void courseName(); //interface method(does not have a body)
    public void lecturer();//interface method(does not have a body)
    public void courseID();
}
// abstract methods are accesed via implement(abstract is extends) 

class Java implements Courses{
    public void courseName(){
        System.out.println("Course: JAVA from scratch for beginners");
    }
    public void lecturer(){
        System.out.println("Lecturer Name: Mr Timson");
    }
    public void courseID(){
        System.out.println("CourseID: JAVA101");
    }
}

public class Main {
    public static void main(String[] args){
        Java newClass = new Java();
        newClass.lecturer();
        newClass.courseID();
        newClass.courseName();

    }
    // Multiple Interfaces can be implemented at once using a comma to seperate them
    
}
