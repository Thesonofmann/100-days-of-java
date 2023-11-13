package day40;

public class Main {
    interface FirstInterface{
        void interMethod1();
        String interMethod2(int i);
        default int interMethod3(){
            return getNumber();
        }
        default int interMethod4(int x){
            return getNumber() + 22;
        }
        private int getNumber(){
            return 42;
        }
        
    }
}
