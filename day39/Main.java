package day39;

public class Main {

    interface Interface1{
        void method1();
        String method2(int i);
    }

    public class MClass implements Interface1{
        public void method1(){
            System.out.println("This is Method1 of Interface1, Implemented in MainClass");
        }
        public String method2(int i){ //certain arguments can be changed here but some must remai
            String a = "Method2 of Interface1, implemented in MainClass";
            return a + i;
        }
    }

    public static void main(String[] args){

        Interface1 interfaceHeadClassBody = new MClass();


    }
    
}
