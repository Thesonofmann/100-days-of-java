public class MyCar {
    
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    public static void main(String[] args){
              
        MyCar myCar = new MyCar();
        myCar.fullThrottle();
        myCar.speed(200);

        Day7 day7 = new Day7();
        Recursion recursion = new Recursion();
        int multiClass1 = day7.permutation(7);
        System.out.println(multiClass1);
        int multiClass2= recursion.permut(15, 2); // ???????
        System.out.println(multiClass2);

        // //accessing Classes on other files without object(Static method)
        // int staticTest = new int(permutation(5)); unsuccessful trial

        int staticTest = Day7.permutation(multiClass1);
        int staticTest2 = Recursion.permut(multiClass2, staticTest);
        System.out.println(staticTest2 + " " + staticTest);

        


    }
}

