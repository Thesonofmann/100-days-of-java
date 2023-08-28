public class Day6 {
    public static void main(String[] args){
        //Pattern Design Programming

        for (int row = 1; row<=4; row++){
            for (int col= 1; col<=5; col++){
                System.out.print(col + " ");
    
            }
            System.out.println();
        }

        /*      Pattern 2
         *      *****
         *      *****
         *      *****
         *      *****
         * 
         */
        System.out.println("Pattern 2");
        int n=4;
        for (int row=1; row<=n; row++){
            for (int col=1; col<=5; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /*      Pattern 3
         *      *
         *      **
         *      ***
         *      ****
         *      *****
         */
        System.out.println("Pattern 3");
         n=5;
        for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
            /*   Pattern 4
             *      1
             *      1 2
             *      1 2 3
             *      1 2 3 4
             */
            System.out.println("Pattern 4");
            for (int col=1; col<=4; col++){
                for (int row=1; row<=col; row++){
                    System.out.print(row + " ");
                }
                System.out.println();
            }
    }
}
