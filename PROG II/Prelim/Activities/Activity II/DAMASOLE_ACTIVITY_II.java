import java.util.Scanner;

public class DAMASOLE_ACTIVITY_II {
    public static void main(String[] args) {
        
        double[] scores = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 10 scores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble(); 
        }

        double total = 0;
        for (double score : scores) {
            total += score;
        }

        double average = total / scores.length;
        System.out.println("\nThe entered score's average is: " + average);
    }
}