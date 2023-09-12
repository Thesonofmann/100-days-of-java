package Day12;
public class Stringmethod {
    // Opp to the comment made on day 4, string method can also be gotten using the return function
        public static String stringmethod(String studentName){
            String newStudent = "The student's name is ";
            return newStudent+ studentName;
        
        }
        public static void main(String[] args){
            System.out.println(stringmethod("Teddy Wizzy"));
        }
}

