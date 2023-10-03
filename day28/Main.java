package day28;
    //Method 2 on how to create a thread(interface method)
class MultiThread implements Runnable{
    public void run() {
        for (int i = 1; i<=10; i++){
            System.out.println(Thread.currentThread().threadId() + " I am a work of art " + i);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} 

public class Main {
    public static void main(String[] args){
        // MultiThread one = new MultiThread();
        // MultiThread two = new MultiThread();

        // one.start(); //this method does not work when using an interface
        
        Thread one = new Thread(new MultiThread()); // Create/ initialize a new thread 
        Thread two = new Thread(new MultiThread());

        one.start();
        two.start();


    }
    
}
