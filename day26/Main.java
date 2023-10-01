package day26;

public class Main {
    //Wrapper Classes
    //Wrappers converts regular primitive data to objects
    public static void main(String[] args){
        int sixty = 60;
        // String sixtyString = sixty.toString();   // does not work. Error

        Integer fifty = 50;
        String fiftyString = fifty.toString();
        
        System.out.println("String: " + fiftyString);
        System.out.println("Integer: " + fifty);
        System.out.println(fifty.doubleValue()); // certain methods can only be used when the data is converted to an object

        System.out.println(); System.out.println(); System.out.println();

        System.out.println();


    }
}
