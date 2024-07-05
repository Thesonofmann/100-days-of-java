package day54;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int attempts = 0;


//      While loop
        while (attempts < 5) {

//           Starting the program
            try {
                // Initialize Scanner
                Scanner scanner = new Scanner(System.in);
                // Collect input for month
                System.out.println("January = 'jan' \n" +
                        "February = 'feb' \n" +
                        "March = 'mar' \n" +
                        "April = 'apr' \n" +
                        "May = 'may' \n " +
                        "June = 'jun' \n" +
                        "July = 'jul' \n" +
                        "August = 'aug'\n" +
                        "September = 'sep' \n" +
                        "October = 'oct'\n" +
                        "November = 'nov'\n" +
                        "December = 'dec' ");
                System.out.print("Input a month from the options above->");
                String month = scanner.nextLine();
                // Initialize variables
                int mainMonth = 0;
                int range;
                int out;

                // Check month
                switch (month.toLowerCase().trim()) {
                    case "jan":
                        mainMonth = 1;
                        break;
                    case "feb":
                        mainMonth = 2;
                        break;
                    case "mar":
                        mainMonth = 3;
                        break;
                    case "apr":
                        mainMonth = 4;
                        break;
                    case "may":
                        mainMonth = 5;
                        break;
                    case "jun":
                        mainMonth = 6;
                        break;
                    case "jul":
                        mainMonth = 7;
                        break;
                    case "aug":
                        mainMonth = 8;
                        break;
                    case "sep":
                        mainMonth = 9;
                        break;
                    case "oct":
                        mainMonth = 10;
                        break;
                    case "nov":
                        mainMonth = 11;
                        break;
                    case "dec":
                        mainMonth = 12;
                        break;
                    // if mainMonth not a month
                    default:
                        mainMonth = 13;
                        System.out.println("Invalid Entry");
                        break;
                }

                if (mainMonth == 13) {
                    attempts++;
                } else if (mainMonth == 9 || mainMonth == 4 || mainMonth == 6 || mainMonth == 11) {
                    System.out.println("Input a year");
                    int year = scanner.nextInt();
                    range = 30;
                    printCal(range);
                    break;
                } else if (mainMonth == 2){
                    System.out.println("Input a year");
                    int year = scanner.nextInt();
                    int leapYear = year % 4;
                    if (leapYear == 0) {
                        range = 29;
                        printCal(range);
                        break;
                    } else {
                        range = 28;
                        printCal(range);
                        break;
                    }
                } else {
                    System.out.println("Input a year");
                    int year = scanner.nextInt();
                    range = 31;
                    printCal(range);
                    break;
                }
            } catch (InputMismatchException e) {
                attempts++;
                System.out.println("Wrong value passed");
            }
        }
    }



    public static void printCal(int range) {
        int week = 0;
        int out;
        System.out.println(" Mon  Tue  Wed  Thur  Fri  Sat  Sun ");
        for (int i = 0; i < range; i++) {
            if (week == 6) {
                out = i + 1;
                System.out.println("  " + out);
                week = 0;
            } else {
                out = i + 1;
                if (i > 8) {
                    System.out.print( "  " + out + " ");
                } else  {
                    System.out.print( "  " + out + "  ");
                }
                week++;
            }
        }
    }
}
