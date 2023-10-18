package day34;

public class Main {
    //Varargs(Variable Arguments)
    public static void main(String... args){
        someMethod("str", 42, 10, 17.23, 4);

    }

    private static String someMethod(String s, int i, double... arr){
        System.out.println("The following are the variable arguments: " + arr[0] + ", " + arr[1] + ", " + arr[2]); //prints: 10.0, 17.23, 4.0
        return s;
    }   
}
