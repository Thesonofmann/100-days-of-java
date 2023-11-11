package day37;
//How to override default methods
//toString method application
public class Main {
    private static class TheParentClass {
        int prop;

       public TheParentClass(){
       }
       public TheParentClass(int prop){
           this.prop = prop;
       }
       // public void someParentMethod(){}
   }
    private static class TheChildClass extends TheParentClass{
        private String prop;

        public TheChildClass(String prop){
            super(42);
            this.prop = prop;
        }
        public TheChildClass(int arg1, String arg2){
            super(arg1);
            this.prop = arg2;
        }
        public void someChildMethod(){}

        @Override
        public String toString() {
            return "TheChildClass{" +
                    "prop='" + prop + '\'' +
                    '}' + " the toString() method here has been override";
        }
    }
    public static void main(String[] args){

    TheChildClass child1 = new TheChildClass("anything at all can be here");

    System.out.println(child1.toString());

    
    
       

    }
}
