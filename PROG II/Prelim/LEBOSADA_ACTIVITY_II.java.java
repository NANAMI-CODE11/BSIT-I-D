import java.util.Scanner;

public class AverageScores {
    public static void main(String[] args) {
        double[] scores = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 scores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }

        double total = 0;
        for (double score : scores) {
            total += score;
        }

        double average = total / scores.length;
        System.out.println("\nThe average of the entered scores is: " + average);
    }
}