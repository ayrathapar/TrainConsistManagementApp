import java.util.*;

public class TrainConsistManagementApp {

    // 🔹 Custom Runtime Exception
    static class EmptyTrainException extends RuntimeException {
        EmptyTrainException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("=======================================\n");

        // Create bogie array (empty case)
        String[] bogieIDs = {};

        // Search key
        String searchID = "BG101";

        try {

            if (bogieIDs.length == 0) {
                throw new EmptyTrainException("No bogies available for search!");
            }

            // 🔹 SEARCH LOGIC (only runs if not empty)
            boolean found = false;

            for (String id : bogieIDs) {
                if (id.equals(searchID)) {
                    found = true;
                    break;
                }
            }

            // Display result
            if (found) {
                System.out.println("Bogie " + searchID + " found.");
            } else {
                System.out.println("Bogie " + searchID + " NOT found.");
            }

        } catch (EmptyTrainException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}