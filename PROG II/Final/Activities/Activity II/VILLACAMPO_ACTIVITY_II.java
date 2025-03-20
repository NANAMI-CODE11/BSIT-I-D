import java.util.Scanner;

public class VILLACAMPO_ACTIVITY_II {

    public static int feetToInches(int feet) {
        return feet * 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of feet: ");

        try {
            int feet = scanner.nextInt();
            int inches = feetToInches(feet);
            System.out.println("Inches: " + inches);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}