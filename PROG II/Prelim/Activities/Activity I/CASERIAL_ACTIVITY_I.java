import java.util.Scanner;

public class CASERIAL_ACTIVITY_I { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];


        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

    
        while (true) {
            System.out.print("Enter a number between 1 and 5 to display a name: ");
            if (scanner.hasNextInt()) {
                int index = scanner.nextInt();
                if (index >= 1 && index <= 5) {
                    System.out.println("The name at position " + index + " is: " + names[index - 1]);
                    break; 
                } else {
                    System.out.println("Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.next();
            }
        }

        scanner.close();
    }
}