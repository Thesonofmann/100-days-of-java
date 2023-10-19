package day35;

public class Main {
    public static void main(String... args){
        //  TheParentClass ref2 = new TheChildClass("something2");
        
        
        
        
        // ref1.someParentMethod();
        //((TheChildClass) ref2).someChildMethod();
        // ref2.someParentMethod();
        
        
        TheChildClass ref1 = new TheChildClass("something1");
        // Same as ref5 but different constructor
        System.out.println("ref1.prop: " + ref1.prop);
        System.out.println(ref1.toString());
        System.out.println("remains a string because inner class was used to create inner class");
        


        System.out.println();
        TheParentClass ref2 = new TheParentClass(11);
        System.out.println("ref2 prop:" + ref2.prop); //doesnt have a child class init so this is 11 not 42
        // System.out.println("ref2 to string: " + ref2.toString());
        System.out.println("ref2 shows that when a parent class is created using a parent class base, you cant access inner class methods so prop remains an int");
        System.out.println();
        


        TheParentClass ref3 = new TheChildClass(21, "Something3");
        System.out.println("ref3 prop: " + ref3.prop);
        System.out.println("ref3 to string method: " + ref3.toString());
        System.out.println("created a child using parent..access to both string and int");


        System.out.println(); 
        TheParentClass ref4 = new TheChildClass("something4");
        System.out.println("ref4 prop: " + ref4.prop);
        System.out.println( "ref4 to string method " + ref4.toString());
        System.out.println("access to both string and int, default int sent to super(constructor method)");
        
        
        System.out.println();
        TheChildClass ref5 = new TheChildClass(21, "nothing5");
        System.out.println("ref5 prop: " + ref5.prop);
        System.out.println("ref5 to string method " + ref5.toString());
        System.out.println("ref5 shows that without a parent class as the basis of creating a child class, the prop feature  will always remain a String");System.out.println();

    }


    

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
                    '}';
        }

}
}
