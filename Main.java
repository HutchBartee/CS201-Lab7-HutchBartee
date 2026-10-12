
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //set the file names
        String inputCSV = "PPShelter.csv";
        String reportFile = "report.txt";
        String errorFile = "error.txt";
        String clear;

        //create the ArrayList of Pet objects
        ArrayList<Pet> pets = new ArrayList<Pet>();

        //call readFile in the Functions.java file
        Functions.readFile(inputCSV, errorFile, pets);

        //setup input from terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Pet Processing Menu ===");
        System.out.println("1. List Adopted Pets");
        System.out.println("2. List Available Pets");
        System.out.println("3. Search Pet by Name");
        System.out.println("Q. Quit");
        try{
            PrintWriter out = new PrintWriter(new FileWriter(reportFile));

            while (true) {
                System.out.print("Enter your choice: ");
                String choice = scanner.nextLine().trim().toUpperCase();

                switch (choice) {
                        case "1":
                            try {

                            }
                            catch (InputMismatchException e){
                                System.out.println("Invalid value was entered.");
                                clear = scanner.nextLine();  
                            }
                            break;

                        case "2":


                            break;
                        case "3":

                            break;
                        case "Q":
                            System.out.println("Goodbye!");
                            scanner.close();
                            out.close();
                            return;
                        default:
                            System.out.println("Invalid choice. Try again.");

                }
            }

        }

        catch (IOException e){
            System.out.println("Error opening file.");
            e.printStackTrace();
        }
    }
}
