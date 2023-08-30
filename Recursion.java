public class Recursion {
    public static void main(String[] args) {
       
        //Solve for 10! / 5!
        int result = sum(10,5);
        System.out.println(result);
      }
      public static int sum(int numerator, int denominator){
        if (numerator > denominator){
            return numerator + sum(numerator-1, denominator);
        }
        else {
            return numerator;
        }
      }
    
}
