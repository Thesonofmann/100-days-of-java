package day26;



public class Except {
    //Java Exceptions 

    //throw + exception(error message to display if condition is not met)
    static void checkAge(int age) {
        if (age < 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years of age");
        } else {
            System.err.println("Access granted");
        }
    }
   
public static void main(String[] args){
     //(try and catch)
     //finally(code that runs after try catch no matter what the result is)
try{
        int[] myNumbers = {1,2,3,4,5,6,7,8};
        System.out.println(myNumbers[15]);
    }
catch(Exception e){
        System.err.println("Oops something went wrong");
    }
finally {
    System.err.println("The try and catch has ended");
}
 System.out.println(); System.out.println();

    checkAge(18);
    checkAge(22);

    checkAge(14);
} 

}
