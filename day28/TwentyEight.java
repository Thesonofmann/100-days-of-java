package day28;

    //Java Threads
    // Running multiple operation(background operations) without interrupting the main op
    
    class Maine extends Thread {
        String one;
        String two;
        String three;
        String four;
    public void run ()
        { for (int i = 1; i<=10; i++){
            System.out.println(Thread.currentThread().threadId() + " Value: " + i);
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        one = "1";
        two = "2";
        three = "3";
        four = "4";
        System.out.println(one + two + three + " " +four );
            
        }
        //Extra body of the Thread can come in here

    }

public class TwentyEight extends Thread {
    
    public static void main(String[] args){
        Maine thread = new Maine();
        thread.start();
        Maine thread2 = new Maine();
        thread2.start();
        

        
    }
}
