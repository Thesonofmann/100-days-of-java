package day40;

public class Main {
    interface FirstInterface{
        void interMethod1();
        public static String interMethod2(){
        return "This is a static method with a body in an interface";
       }
        default int interMethod3(){
            return getNumber();
        }
        default int interMethod4(int x){
            return getNumber() + 22;
        }
        private int getNumber(){
            return 42;
        }
        
        public static void main(String[] args){
            String ff= FirstInterface.interMethod2();
            System.out.println(ff);
        }
    }
}
