import java.util.Scanner;

public class Axcel_DelosReyes_ActivityII {
    public static void main(String[] args) {
        // Create an array to store 10 scores
        double[] scores = new double[10];
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 scores
        System.out.println("Please enter 10 scores:");

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter score " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    scores[i] = scanner.nextDouble();
                    break;  // Exit the loop once a valid score is entered
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.next();  // Consume the invalid input
                }
            }
        }

        // Calculate the average of the scores
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += scores[i];
        }
        double averageScore = sum / 10;

        // Print the average result
        System.out.println("The average score is: " + averageScore);
        
        scanner.close();
    }
}