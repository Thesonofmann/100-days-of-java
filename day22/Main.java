package day22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    //DateTimeFormatter
    public static void main(String[] args){
        //Printing todays date
    LocalDateTime todaysDate = LocalDateTime.now();
    System.out.println(todaysDate);

    DateTimeFormatter myFormattedDate = DateTimeFormatter.ofPattern("MM/dd-yyyy HH:mm:ss");   //Initializing the date formatter method and the format type in String hence the ""

    //First method of displaying formatted date(NO VARIABLE)
    System.out.println("Printing without declaring a string variable " + todaysDate.format(myFormattedDate));

    
    
    //Method 2(Create a String object and store the formatted date within)
    System.out.println();
    String formattedDateString = todaysDate.format(myFormattedDate);
    System.out.println("Today's Date after formatting and saving as a String" + formattedDateString);

    }
}
