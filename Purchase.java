import java.util.Scanner;

public class Purchase{
    public static void main(String[] args){
        String[] product= new String[3];
        product[0]= "Colgate";
        product[1]= "Corn-flakes";
        product[2]= "Peak milk";
        double[] price = new double[3];
        price[0] = 755.76;
        price[1] = 544.99;
        price[2]= 322.08;
        double totalPrice = 0.00;
        Scanner in = new Scanner(System.in);

        System.out.println("What would you like to buy?");
        String purchase = in.nextLine();
        for (int c=0; c< product.length; c++ ){
            while (product[c].equals(purchase)){

                System.out.println("How many units");
                        int quantity = in.nextInt();
                        double amount1= price[c] * quantity;

                        // System.out.println(amount1);
                    
                      //  System.out.println("What else do you want to buy?");
                        totalPrice= amount1+ totalPrice;
                    break;
                  // System.out.println("This " + purchase + " is not available at our store");
            }
        }

            System.out.println("Your order costs #" + totalPrice);


       
                 in.close();

        



    }
}