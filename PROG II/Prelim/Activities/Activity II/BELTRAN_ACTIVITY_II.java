import java.util.Scanner;

public class BELTRAN_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter score " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    scores[i] = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); 
                }
            }
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