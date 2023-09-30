package day25;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    //Java Iterator
    //In order to loop succesfully, we use while and .hasnext()
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<String>();
        names.add("Ashhhh");
        names.add("Emma");
        names.add("Mr Kay");
        names.add("Ada");
        names.add("Ella");
        names.add("Jerry");

        Iterator<String> namesit = names.iterator();  //get(import, initialize) the iterator using the varName of the arrayList
        while(namesit.hasNext()){
        System.out.println(namesit.next());    
    }
    ArrayList<Integer> numb = new ArrayList<Integer>();
    numb.add(5);
    numb.add(8);
    numb.add(12);
    numb.add(11);
    numb.add(4);
    numb.add(3);
    numb.add(144);
    numb.add(16);
    numb.add(41);
    numb.add(22);

    System.out.println();    
    Iterator<Integer> numbit = numb.iterator();
    // while (numbit.hasNext()){
    //     System.out.println(numbit.next());
    // }
    //Just noticed that 2 while loops cannot run after each other, had to comment one for 2 to run successfully
    
System.out.println();
System.out.println();


while(numbit.hasNext()){
    int x = numbit.next();  //Here, either Integer or int can be used to declare the variable x
    if (x < 10){
        numbit.remove();
    }
    else {
        System.out.println(x + " is greater than 10");
    }
}
System.out.println(numb);

}

}
