public class Day5 {
    public static void main(String[] args){
/*
 * A method is a block of code that only runs when it is called, a.k.a fuctions
 * 
 * In a method, return only works for int and char, String is not a primitive data type. IN order to get a string, void and sout will replace int and return
 * 
 * Note: Multiple methods can have the same name as long as the number and/or type of parameters are different....Method Overloading
 *
 */

    int myNum1 = plusMethod(10, 5);
    double myNum2 = plusMethod(4.3, 9.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);

    }

    static int plusMethod(int x, int y) {
        return x + y;
      }
      
      static double plusMethod(double x, double y) {
        return x + y;
      }



}
