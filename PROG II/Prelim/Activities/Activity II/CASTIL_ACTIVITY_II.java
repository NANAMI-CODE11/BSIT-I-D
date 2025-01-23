import java.util.Scanner;

public class CASTIL_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += scores[i];
        }
        double average = sum / 10;
        System.out.println("The average score is: " + average);

        scanner.close();
    }
}
