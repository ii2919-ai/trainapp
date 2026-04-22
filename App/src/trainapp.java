import java.util.*;

// Main class
public class trainapp {
    public static void main(String[] args) {

        // Array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        printArray(capacities);

        // Bubble Sort logic
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // optimization

            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("\nSorted Capacities (Ascending):");
        printArray(capacities);
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}