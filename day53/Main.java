package day53;

import java.util.Scanner;

public class Main extends ToDoList{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoLIst newList = new ToDoLIst();


    while(true){
        System.out.println("Type 'add' to add a new item to your list");
        System.out.println("Type edit to edit an item on your list");
        System.out.println("Type 'print' to print the items on your TDL");
        System.out.println("Type 'remove to remove an item from the list");
        System.out.println("Press x to exit");
        String command = sc.nextLine();
        if (command.equalsIgnoreCase("add")){
            System.out.print("Input your new item here:");
            String newItem = sc.nextLine();
            System.out.println(newList.addItem(newItem));
            System.out.println();
        }
        else if (command.equalsIgnoreCase("print")){
            newList.printItems();
            System.out.println();
        }
        else if(command.equalsIgnoreCase("x")){
            System.out.println("THANK YOU FOR COMING");
            System.exit(0);
        }
        else if(command.equalsIgnoreCase("edit")){
            newList.printItems();
            System.out.println("enter the number you want to edit");
            int position = sc.nextInt() -1 ;
            sc.nextLine();
            System.out.println("Input your new item here");
            String newItem = sc.nextLine();
            newList.editItems(position, newItem);
        }
        else if(command.equalsIgnoreCase("remove")){
            newList.printItems();
            System.out.println("enter the item number you want to remove");
            int position = sc.nextInt() -1 ;
            sc.nextLine();
            newList.removeItems(position);
        }
        else {
            System.out.println("WRONG COMMAND! TRY AGAIN");
        }





    }
    }


}