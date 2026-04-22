import java.util.*;

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor with validation
    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
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

        List<PassengerBogie> bogieList = new ArrayList<>();

        try {
            // Valid bogies
            bogieList.add(new PassengerBogie("Sleeper", 72));
            bogieList.add(new PassengerBogie("AC Chair", 56));

            // Invalid bogie (will throw exception)
            bogieList.add(new PassengerBogie("First Class", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies only
        System.out.println("\nValid Bogies in Train:");
        for (PassengerBogie b : bogieList) {
            b.display();
        }
    }
}