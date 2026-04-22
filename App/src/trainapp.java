import java.util.LinkedHashSet;

public class trainapp {
    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate
        train.add("Sleeper"); // This will be ignored

        // Display final train formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(train);
    }
}