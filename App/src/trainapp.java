import java.util.*;

// Main class
public class trainapp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sorted array of bogie IDs (IMPORTANT: must be sorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Display bogie IDs
        System.out.println("Available Bogie IDs (Sorted):");
        System.out.println(Arrays.toString(bogieIds));

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // Binary Search logic
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                System.out.println("Bogie found at position: " + mid);
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1; // search left half
            } else {
                low = mid + 1;  // search right half
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found in the train.");
        }

        sc.close();
    }
}