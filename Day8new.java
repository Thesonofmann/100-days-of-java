public class Day8new {
    //Difference between static and public methods
    //Static
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating an object");
    }
    //Public 
    public void myPublicMethod(){
        System.out.println("Public methods can only be called by creating objects");

    }
    public static void main(String[] args){
        myStaticMethod(); // Calls the static method without creating object

        Day8new newObject = new Day8new(); // New object
        newObject.myPublicMethod(); //Calls the public method using object

       //  newObject.myStaticMethod(); // calls the static method using object...works with an error
       
    }

}
