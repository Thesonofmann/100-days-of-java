package Day16;
// Check txt for questions

public class VariableSwapper {
    private int a;
    private int b;

    // Constructor
    public VariableSwapper(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        int temp = a;
        a = b;
        b = temp;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        VariableSwapper swapper = new VariableSwapper(x, y);
        swapper.swap();

        System.out.println("After swapping:");
        System.out.println("x = " + swapper.getA());
        System.out.println("y = " + swapper.getB());
    }
}

