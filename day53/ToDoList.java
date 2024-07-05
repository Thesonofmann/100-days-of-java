package day53;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    /**
     * Create a class name it TodoList and create methods for
     * adding, removing, printing and modifying
     * Then create a main class and in its main
     * method create an object of the
     * TodoList class and add,remove and modify values
     */

    /*
    create an arrayList for the items.
    then a method to add.
    a method to remove
    and a method to print each item on the array
    create a method to edit the array like set method

     */



    List<String> toDoList = new ArrayList<>();

    public String addItem(String newItem){
        toDoList.add(newItem);
        return "ITEM SUCCESSFULLY ADDED";
    }

    public void printItems(){
        System.out.println("TO-DO LIST");
        for (int x =0; x< toDoList.size(); x++){
            System.out.println( (x+1) + ". " + toDoList.get(x));
        }
    }

    public void editItems(int position, String newItem){
        if (position<toDoList.size()) {
            toDoList.set(position, newItem);
            System.out.println("ITEM SUCCESSFULLY MODIFIED");
            System.out.println();
        }else {
            System.out.println("INVALID POSITION, COULD NOT MODIFY ITEM");
            System.out.println();
        }
    }

    public void removeItems(int position){
        if (position <toDoList.size()) {
            toDoList.remove(position);
            System.out.println("ITEM SUCCESSFULLY REMOVED");
            System.out.println();
        } else {
            System.out.println("INVALID POSITION, COULD NOT REMOVE ITEM");
            System.out.println();
        }
    }

}