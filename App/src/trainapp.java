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
        bogieList.add(new Bogie("Sleeper", 80));

        // Stream pipeline: map + reduce
        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)      // extract capacity
                .reduce(0, Integer::sum);  // sum all values

        // Display total seating capacity
        System.out.println("Total Seating Capacity of Train: " + totalSeats);

        // Display original list (to verify unchanged)
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}