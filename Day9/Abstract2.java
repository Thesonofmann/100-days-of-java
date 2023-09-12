package Day9;

class Abstract2 {
    public static void main(String[] args) {
        //create an object of the Student class(which inherits attributes and methods from Abstract)
        Student newObject = new Student();

     
        System.out.println("Name: " + newObject.fname);
        System.out.println("Age: " + newObject.age);
        System.out.println("Graduation Year " + newObject.graduationYear);
           newObject.study(); // calls the abstract method

    }
}
