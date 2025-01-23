import java.util.Scanner;

public class ROMERA_ACTIVITY_II {
    public static void main(String[] args) {
        
        double[] scores = new double[10];
        double sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 scores:");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];
        }

        double average = sum / scores.length;

        System.out.println("The average is: " + average);

        scanner.close();
    }
}