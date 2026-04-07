import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("=======================================\n");

        // Create array of bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search
        String searchID = "BG309";

        // Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }


        boolean found = false;

        for (String id : bogieIDs) {
            if (id.equals(searchID)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + searchID + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchID + " NOT found.");
        }

        System.out.println("\nUC18 search completed...");
    }
}