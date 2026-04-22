import java.util.LinkedList;

public class trainapp {
    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add initial bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2 (index 2)
        train.add(2, "Pantry");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // Final Output
        System.out.println("\nFinal Ordered Train Consist:");
        for (String bogie : train) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");
    }
}