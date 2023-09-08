public class Day8 {
    final int y = 11; //makes the attribute(Variable) unable to be modified/edited
    
    public static void main(String[] args){
        Day8 myFirstDay8 = new Day8();
        Class myFirstClass = new Class();
        Class mySecondClass = new Class();
        int fiftyFive = 555;

        System.out.println(myFirstClass.y);
        System.out.println("Modifier");

        // Modify/overriding existing attributes
         myFirstClass.y = fiftyFive;
         System.out.println(fiftyFive);
         System.out.println(myFirstClass.y);


         //Same variable(Attributes), different class
         System.out.println(myFirstDay8.y);
         System.out.println("Second Class");


         // Only attributes in myfirstclass were modified 
         System.out.println(mySecondClass.y);


    }
    
    static class Class{
        int y = 55;
    }
}
