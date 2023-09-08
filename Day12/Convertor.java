package Day12;

public class Convertor {
    //Given that a matrix when converted to kg is 2204, using java function, pass a value to the parameter and convert to kg
    static int convertor(int metric){
        int kg = metric / 2204;
        return kg;
    }
    
    public static void main(String[] args){
        int solution = convertor(45000);
        System.out.println(solution);
    }
}
