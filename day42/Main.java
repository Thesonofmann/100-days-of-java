package day42;

import java.util.Scanner;
public class Main {


    static StringBuilder editedString;
    static StringBuilder originalString;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        editedString = new StringBuilder(input);
        originalString = new StringBuilder(input);

        processUserInput(scanner);

        System.out.println("Resultant string: " + editedString);
    }

    private static void processUserInput(Scanner scanner) {
        System.out.println("Current string: " + editedString);
        System.out.println("Enter a command (U, L, R, C ch1 ch2, -, X to exit):");
        String command = scanner.nextLine();

        if (!command.equals("X")) {
            performOperation(command);
            processUserInput(scanner); // Recursive call
        }
    }

    private static void performOperation(String command) {
        switch (command) {
            case "U":
                editedString = new StringBuilder(editedString.toString().toUpperCase());
                break;
            case "L":
                editedString = new StringBuilder(editedString.toString().toLowerCase());
                break;
            case "R":
                editedString = new StringBuilder(editedString.reverse().toString());
                break;
            case "-":
                editedString = new StringBuilder(originalString.toString());
                break;
            default:
                if (command.length() >= 3 && command.charAt(0) == 'C' && command.charAt(1) == ' ') {
                    char ch1 = command.charAt(2);
                    char ch2 = (command.length() >= 4) ? command.charAt(3) : ' ';
                    editedString = new StringBuilder(editedString.toString().replace(ch1, ch2));
                } else {
                    System.out.println("Invalid command. Please try again.");
                }
                break;
        }
    }
}