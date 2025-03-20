import java.util.Scanner;

public class ABATAYO_ACTIVITY_II {

    public static int convertFeetToInches(int feet) {
        return feet * 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of feet: ");
        int feet = scanner.nextInt();
        int inches = convertFeetToInches(feet);
        System.out.println("Inches: " + inches);
        scanner.close();
    }
}