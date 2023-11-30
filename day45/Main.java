package day45;

public class Main {

        public static void main(String[] args) {
    
    
            // Logical Operators...AND and OR
            System.out.println(4 > 8 && 2 < 8 && 14 > 4);
            System.out.println(4 > 8 || 2 < 8);
            
            //order of precedence
            System.out.println(8 + (9 * (7 + 9)));
            
            //unary operators
            int i = 9;
            System.out.println(i);
            i++;
            ++i;
            
            --i;
            i--;
            System.out.println(i);
    
}}