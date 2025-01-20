import java.util.Scanner;

public class BARGAMENTO_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];

    
        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

    
        System.out.println("\nEnter a number (1-5) to display the corresponding name:");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 5) {
            System.out.println("Selected Name: " + names[choice - 1]);
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }

    
        scanner.close();
    }
}
