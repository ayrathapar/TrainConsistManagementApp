import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("=======================================\n");

        // Create array of bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 🔹 Ensure sorted (important precondition)
        Arrays.sort(bogieIDs);

        // Search key
        String key = "BG309";

        // Display sorted bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }

        // 🔥 BINARY SEARCH LOGIC
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIDs[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}