import java.util.Scanner;

public class DAMASOLE_FINALS {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Welcome to the Comprehensive Java Program!");

        int sum = 0, count = 0;

        double average;
        System.out.println("\nFor Loop Demonstration:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }
        System.out.println("\nEnter numbers (enter a negative number to stop):");
        while (true) {
            int number = scanner.nextInt();
              
            if (number < 0) {
                break;
            } else if (number > 100) {
                System.out.println("Number is too large!");
            } else {
                sum += number;
                count++;
            }
        } 
        if (count > 0) {
            average = (double) sum / count;
            System.out.printf("Total sum: %d\n", sum);
            System.out.printf("Average: %.2f\n", average);
        }  
        System.out.println("\nSwitch Case Demonstration:");
        System.out.println("Enter a number (1-3):");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You selected Option 1");
                break;
            case 2:
                System.out.println("You selected Option 2");
                break;
            case 3:
                System.out.println("You selected Option 3");
                break;
            default:
                System.out.println("Invalid option");
        }
        System.out.println("\nNested If Demonstration:");
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        
        if (age >= 0) {
            if (age < 13) {
                System.out.println("You are a child");
            } else if (age < 20) {
                System.out.println("You are a teenager");
            } else if (age < 60) {
                System.out.println("You are an adult");
            } else {
                System.out.println("You are a senior citizen");
            }
        } else {
            System.out.println("Invalid age");
        }
        
        scanner.close();
        System.out.println("\nProgram completed successfully!");
    }
}

/* RUN BOY RUN! */ 