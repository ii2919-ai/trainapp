import java.util.*;
import java.util.stream.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// Main class
public class trainapp {
    public static void main(String[] args) {

        // Creating list of bogies
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 80));      // duplicate type for grouping
        bogieList.add(new Bogie("AC Chair", 60));

        // Grouping bogies by type (name)
        Map<String, List<Bogie>> groupedBogies =
                bogieList.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped bogies
        System.out.println("Grouped Bogies by Type:\n");

        if (groupedBogies.isEmpty()) {
            System.out.println("No bogies available.");
        } else {
            for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
                System.out.println("Type: " + entry.getKey());

                for (Bogie b : entry.getValue()) {
                    b.display();
                }
                System.out.println();
            }
        }

        // Verifying original list remains unchanged
        System.out.println("Original Bogie List:");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}