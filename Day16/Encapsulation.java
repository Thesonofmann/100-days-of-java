package Day16;

class MySuperClass {
        int a;
        int b;
    
        int add() {
            return a + b;
        }
    }
    
    class MySubClass extends MySuperClass {
        int c;
    
        int subtract() {
            return a - b - c;
        }
    }

class EncapsulatedClass {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    int add() {
        return a + b;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
       
        // Inheritance
        MySubClass subObj= new MySubClass();
        subObj.a = 5;
        subObj.b = 3;
        subObj.c = 2;
        int resultAdd = subObj.add();
        int resultSubtract = subObj.subtract();

        System.out.println("Inheritance - Add: " + resultAdd);
        System.out.println("Inheritance - Subtract: " + resultSubtract);

        // Encapsulation
        EncapsulatedClass encapsulatedObj = new EncapsulatedClass();
        encapsulatedObj.setA(11);
        encapsulatedObj.setB(12);
        int encapsulatedResult = encapsulatedObj.add();

        System.out.println("Encapsulation - Add: " + encapsulatedResult);
    }
    
}
