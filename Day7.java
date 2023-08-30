import java.util.Scanner;

public class Day7 {
    public static void main(String[] args){
      
      
        //Using Java Recursion to solve for 10!
        int result = permutation(5);
        System.out.println(result);

        System.out.println("Method 2");
        System.out.println("Input a number");
        Scanner in= new Scanner(System.in);
        int no2 = in.nextInt();
        System.out.println(permutation(no2));
      
      
      // This also works
      //  System.out.println(permutation(10));
      in.close();

    }
    public static int permutation(int x){
        if (x>0){
            return x + permutation(x-1);
        }
        else return 0;
    }
    
}
