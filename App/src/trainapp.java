import java.util.HashSet;
import java.util.Set;

public class trainapp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");
 feature/UC3-tracking
        // Create HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIDs);

        // Program continues
        System.out.println("\nSystem ensures all bogie IDs are unique.");
        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies (CREATE operation)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion (READ operation)
        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (DELETE operation)
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence (SEARCH operation)
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does NOT exist in the train.");
        }

        // Final state of list
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem ready to manage train consist..."); dev
    }
}