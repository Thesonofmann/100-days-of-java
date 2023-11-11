package day38;

public class Main {
    
    public static String NEW_STRING = "This string has it's variable in all caps, I didn't know that was possible";
    
    
    public static void main(String[] args){

        //Static methods: they do not require objects to be invoked
        //Instance methods: they require objects to be invoked
        System.out.println(Main.NEW_STRING);

        System.out.println(NEW_STRING + " Trial 2");

    }
    
}
