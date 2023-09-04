package Day9;

// Abstract class
abstract class Abstract {
    public String fname = "SONxMAN";
    public int age = 22;
    public abstract void study(); //abstract method
}

// Subclass (inherit from Abstract2)
class Student extends Abstract {
    public int graduationYear = 2020;
    public void study() { // the body of the abstract method is provided here
        System.out.println("I still have a hard time grasping the concept of abstract and how subclass works");
    }

}