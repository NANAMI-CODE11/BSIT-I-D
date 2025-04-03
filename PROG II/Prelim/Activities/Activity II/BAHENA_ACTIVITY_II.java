import java.util.Scanner;
class main BAHENA_ACTIVITY_II {}
public class AverageScores {
    public static void main(String[] args) {
        
        double[] scores = new double[10];
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Please enter 10 scores:");

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter score " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    scores[i] = scanner.nextDouble();
                    break;  
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.next();  
                }
            }
        }

        
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += scores[i];
        }
        double averageScore = sum / 10;

        
        System.out.println("The average score is: " + averageScore);
        
        scanner.close();
    }
}
