import java.util.*;

// Main class
public class trainapp {
    public static void main(String[] args) {

        // Array of bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Display original array
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using Arrays.sort()
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("\nSorted Bogie Names (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));
    }
}