package day21;
   //Enumeration(JAVA enum)
    enum Level{
        EASY, MEDIUM, high
    }
    
    enum Courses{
        JAVA,
        MONGODB,
        LOGIC
    }



public class New {
    public static void main(String[] args){

        for (Courses myC : Courses.values()){
            System.out.println(myC);
        }

        //Declaring an enum object to access the attributes
        Level level1 = Level.EASY;
        // System.out.println(level1);
        
        Level level2 = Level.MEDIUM;
        Level level3 = Level.high;

        switch(level1){
            case EASY: 
                System.out.println("This level is easy");
                break;
            case MEDIUM:
                System.out.println("This level is MID");
                break;
            case high:
                System.out.println("This level is hard");
        }

        System.out.println("Switch case test 2");
        System.out.println();
        switch(level2){
            case EASY: 
                System.out.println("This level is easy");
                break;
            case MEDIUM:
                System.out.println("This level is MID");
                break;
            case high:
                System.out.println("This level is hard");
        }
       
        System.out.println("Switch case test 3");
        System.out.println();
        switch(level3){
            case EASY: 
                System.out.println("This level is easy");
                break;
            case MEDIUM:
                System.out.println("This level is MID");
                break;
            case high:
                System.out.println("This level is hard");
        }

        //Looping through an enum
        for (Courses myCourses : Courses.values()){
            System.out.println(myCourses);
        }

    }    

}
