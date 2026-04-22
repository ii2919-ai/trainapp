import java.util.*;
import java.util.stream.*;

// Goods Bogie class
class GoodsBogie {
    String type;   // e.g., Cylindrical, Open, Box
    String cargo;  // e.g., Petroleum, Coal, Grain

    // Constructor
    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // Display method
    void display() {
        System.out.println(type + " Bogie - Cargo: " + cargo);
    }
}

// Main class
public class trainapp {
    public static void main(String[] args) {

        // Creating list of goods bogies
        List<GoodsBogie> goodsList = new ArrayList<>();

        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Open", "Coal"));
        goodsList.add(new GoodsBogie("Box", "Grain"));
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Try changing above to ("Cylindrical", "Coal") to test failure

        // Safety validation using allMatch()
        boolean isSafe = goodsList.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Display bogies
        System.out.println("Goods Bogies:");
        for (GoodsBogie b : goodsList) {
            b.display();
        }

        // Display result
        System.out.println("\nSafety Compliance Status:");
        if (isSafe) {
            System.out.println("Train is SAFE for operation.");
        } else {
            System.out.println("Train is NOT SAFE! Invalid cargo detected.");
        }
    }
}