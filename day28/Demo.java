package day28;

public class Demo {
    // How to create a thread inside the main class....Extension of day28.Main.java
    private static int count = 0;

    public static synchronized void inccount() {// using this method to increment count instead of using count++ in each thread because synchronized helps multiple threads accessing one variable to run faster(one at a time)
        count++;

    }
    public static void main(String[] args){
         
        Thread newone = new Thread (new Runnable() {// body of the thread interface is inserted here after calling it
            public void run() {
                for (int i = 1; i<=10; i++){
                    System.out.println(Thread.currentThread().threadId() + " I am a work of art " + i);
                   // count++;
                   inccount();
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        newone.start();  //start() method is called after the body has been created

        //Testing if I can use this for a second Thread
        Thread newtwo = new Thread (new Runnable() {
            public void run ()
        { for (int i = 1; i<=10; i++){
            System.out.println(Thread.currentThread().threadId() + " Value: " + i);
            // count++;
            inccount();
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
        });
        newtwo.start(); //Cebon!

        try {
            newone.join(); // without joining, count below will print value as 0;
            newtwo.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Value: " + count);


        
    }
    
}
