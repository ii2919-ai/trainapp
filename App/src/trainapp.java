import java.util.*;

// Main class
public class trainapp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Display available bogies
        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Linear Search logic
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie found at position: " + i);
                break; // early termination
            }
        }

        // If not found
        if (!found) {
            System.out.println("Bogie ID not found in the train.");
        }

        sc.close();
    }
}