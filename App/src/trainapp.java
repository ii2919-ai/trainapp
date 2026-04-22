import java.util.*;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String type;   // Rectangular, Cylindrical
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    void assignCargo(String cargo) {
        try {
            // Rule: Rectangular bogie cannot carry Petroleum
            if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe Assignment: Rectangular bogie cannot carry Petroleum");
            }

            // If valid, assign cargo
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo + " to " + type + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed for " + type + " bogie.\n");
        }
    }

    // Display method
    void display() {
        System.out.println(type + " Bogie - Cargo: " + (cargo != null ? cargo : "None"));
    }
}

// Main class
public class trainapp {
    public static void main(String[] args) {

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (will be handled)
        b2.assignCargo("Petroleum");

        // Another safe assignment to show program continues
        b2.assignCargo("Coal");

        // Display final state
        System.out.println("Final Bogie Status:");
        b1.display();
        b2.display();
    }
}