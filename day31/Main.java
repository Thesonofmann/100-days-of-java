package day31;

public class Main {
    public static void main(String...args){
        
        String one = "one";

        String n = null;

        System.out.println(n);
        System.out.println(one);
        String five = "5";
        String six = "6";
        String eleven = five + six; //prints 56 not 11
        System.out.println(eleven);

        String html = "<html>\n" +
                    "           <body>\n" +
                    "               <p>Hello World.</p>\n" +
                    "           </body>\n" +
                    "  </html>";
            System.out.println("start");
            System.out.println(html);
        System.out.println("finish");
        System.out.println();

        // String html2 = `<html>
        //                     <body>
        //                             <p> Hello World. </p> 
        //                     </body>
        //                 </html>
        //                `;  //error

        System.out.println("start");
        // System.out.println(html2);
        System.out.println("finish");
    var finishing = "the end";
    System.out.println(finishing);

    int num = 657464658;
    String numString = String.valueOf(num);
    System.out.println(numString);

    }
    
}
