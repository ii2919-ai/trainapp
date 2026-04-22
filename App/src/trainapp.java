import java.util.*;
import java.util.regex.*;

// Main class
public class trainapp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Create matcher objects
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // Validation
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Output results
        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        sc.close();
    }
}