package day33;



public class Correction {
    public static void main(String...args){
        
    int x =10;
    // for(int i=0; i<=2; ++i){
    try{
        if (x++>10){
            throw new RuntimeException("The x value is out of the range: " + x);
        }
        System.out.println("The x value is within the range: " + x);
    } catch (RuntimeException ex) {
        System.out.println(ex.getMessage());
    }
}
    // }


}