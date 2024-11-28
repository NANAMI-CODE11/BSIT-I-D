
import java.util.Scanner;

public class BARGAMENTO_ACTIVITY_III {
    
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of seconds
        System.out.print("Enter the number of seconds to countdown: ");
        int seconds = scanner.nextInt();
        
        // Countdown using a while loop
        while (seconds > 0) {
            System.out.println(seconds); // Print the current second
            seconds--; // Decrement the counter
        }

        // Optionally, print 0 at the end of the countdown
        System.out.println("0");

        // Close the scanner object
        scanner.close();
    }
}