package day39;

public class Main {

    interface Interface1{
        void method1();
        String method2(int i);
    }

   public static class MC implements Interface1{
        int x = 60;
        String xx = "new String";

        public void method1(){
            System.out.println("This is Method1 of Interface1, Implemented in MainClass");
        }
        public String method2(int i){ //certain arguments can be changed here but some must remai
            String a = "Method2 of Interface1, implemented in MainClass";
            return a ;
        }
    }

    public static void main(String[] args){

        Interface1 interfaceHeadClassBody;
        interfaceHeadClassBody = new MC();
        //the above class cannot be instantiated unless the class MC is declared as static

        interfaceHeadClassBody.method2(44);





    }
    
}
;