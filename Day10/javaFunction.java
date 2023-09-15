package Day10;

public class JavaFunction {
    public static int multiply(int x, int y){
        int result = x * y;
        return result;
    }

    public static void main(String[] args){
        System.out.println(multiply(10, 42));
        multiply(12, 21);
        System.out.println("You know what time it is");
    }
}
