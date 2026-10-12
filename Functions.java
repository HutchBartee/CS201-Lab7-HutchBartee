
import java.io.*;
import java.util.*;

public class Functions {

    //PRE: accepts a string
    //POST: returns true or false depending on if the string only contains numeric digits
    public static boolean isDigits(String str) {
        return str.matches("\\d+");
    }


    //PRE: accepts a filename, errorlog and an empty ArrayList of Pet objects
    //POST: opens the input file (filename) and the error log
    //      calculates the fields ageAtDateTime and ageCurrent
    //      loads valid values into the Pet ArrayList
    public static void readFile(String filename, String errorLog, ArrayList<Pet> allPets) {
     
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            PrintWriter errWriter = new PrintWriter(new FileWriter(errorLog));
        

            br.close();
            errWriter.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    //other functions would go here:
}
