import java.util.*;

// Main class
public class trainapp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Bogie list (try empty list to test exception)
        List<String> bogieIds = new ArrayList<>();
        // Uncomment below to test normal case
        // bogieIds.add("BG101");
        // bogieIds.add("BG205");
        // bogieIds.add("BG309");

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            // Defensive check
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("Search cannot be performed: No bogies in the train.");
            }

            // Linear Search logic
            boolean found = false;
            for (String id : bogieIds) {
                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie found in the train.");
            } else {
                System.out.println("Bogie not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}