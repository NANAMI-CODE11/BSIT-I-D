import java.util.Scanner;

public class AverageScore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] scores = new double[10];
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Consume the invalid input
            }
            scores[i] = input.nextDouble();
            sum += scores[i];
        }

        double average = sum / 10;
        System.out.println("The average score is: " + average);
        input.close();
    }
}