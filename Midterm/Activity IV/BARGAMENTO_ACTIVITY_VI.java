
import java.util.Scanner;

public class BARGAMENTO_ACTIVITY_VI {
    public static void main(String[] args) {
        // Create a Scanner object for getting input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Validate if the input is a non-negative integer
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Initialize the factorial variable
            long factorial = 1;

            // Calculate the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;  // Multiply the current factorial by i
            }

            // Output the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}