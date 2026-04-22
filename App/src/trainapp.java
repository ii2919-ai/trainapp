import java.util.ArrayList;
import java.util.List;

public class trainapp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

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

        System.out.println("\nSystem ready to manage train consist...");
    }
}