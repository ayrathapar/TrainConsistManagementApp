import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC4: Ordered Train using LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Adding bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("After adding Pantry: " + train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Final state
        System.out.println("Final Train Consist: " + train);
    }
}