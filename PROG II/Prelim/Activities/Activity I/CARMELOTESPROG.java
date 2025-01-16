import java.util.Scanner;

public class CARMELOTES_ACTIVITY_1 {
    public static void main(String[] args) {
        
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        
        System.out.print("Enter a number (1-5) to display the name: ");
        int index = scanner.nextInt() - 1;
        
        if (index >= 0 && index < 5) {
            System.out.println("The selected name is: " + names[index]);
        } else {
            System.out.println("Invalid number entered.");
        }
        
        scanner.close();
    }
}

