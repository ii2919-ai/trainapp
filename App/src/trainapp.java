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
}

// Main class
public class trainapp {
    public static void main(String[] args) {

        // Creating a large dataset of bogies
        List<Bogie> bogieList = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogieList.add(new Bogie("Sleeper", 50 + (i % 50))); // capacities from 50–99
        }

        // -------------------------------
        // Loop-based filtering
        // -------------------------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogieList) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------------------------------
        // Stream-based filtering
        // -------------------------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------------------------------
        // Results
        // -------------------------------
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        // Verify both results are same
        if (loopResult.size() == streamResult.size()) {
            System.out.println("\nResult: Both approaches produce SAME output.");
        } else {
            System.out.println("\nResult: Outputs are DIFFERENT!");
        }
    }
}