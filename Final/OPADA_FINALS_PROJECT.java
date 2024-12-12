import java.util.Scanner;

public class OPADA_FINALS_PROJECT {
    public static void main(String[] args) {
        // Welcome the User
        System.out.println("Welcome to Your Java Learning Adventure!");
        System.out.println("Let's explore programming together!");
        
        // Create a Scanner 
        Scanner explorer = new Scanner(System.in);
        
        // String introduction
        System.out.println("\n--- Strings: Your First Programming Friends ---");
        System.out.print("What's your name? ");
        String playerName = explorer.nextLine();
        System.out.println("Hi, " + playerName + "! Nice to meet you!");
        
        // Arithmetic basics
        System.out.println("\n--- Arithmetic: Let's Do Some Math Magic ---");
        System.out.print("Give me a number: ");
        int firstNumber = explorer.nextInt();
        System.out.print("Now another number: ");
        int secondNumber = explorer.nextInt();
        
        // Arithmetic operations
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        
        // if statement
        System.out.println("\n--- Conditions: Making Decisions ---");
        if (sum > 100) {
            System.out.println("Wow! Your numbers are big!");
        } else if (sum > 50) {
            System.out.println("Those are pretty good-sized numbers!");
        } else {
            System.out.println("Small but mighty numbers!");
        }
        
        // Multiple conditions
        System.out.println("\n--- Multiple Conditions: Complex Decisions ---");
        System.out.print("Enter your age: ");
        int age = explorer.nextInt();
        System.out.print("Enter your grade level: ");
        int grade = explorer.nextInt();
        
        if (age >= 18 && grade >= 12) {
            System.out.println("You're ready for college adventures!");
        } else if (age >= 16 || grade >= 10) {
            System.out.println("You're on an exciting learning journey!");
        } else {
            System.out.println("Keep learning and growing!");
        }
        
        // switch case
        System.out.println("\n--- Switch Case: Choosing Paths ---");
        System.out.println("Pick a favorite subject:");
        System.out.println("1. Math");
        System.out.println("2. Science");
        System.out.println("3. History");
        System.out.println("4. Art");
        
        int subject = explorer.nextInt();
        switch (subject) {
            case 1:
                System.out.println("Math: The language of logic!");
                break;
            case 2:
                System.out.println("Science: Exploring the universe!");
                break;
            case 3:
                System.out.println("History: Stories of our past!");
                break;
            case 4:
                System.out.println("Art: Creativity unleashed!");
                break;
            default:
                System.out.println("Interesting choice!");
        }
        
        // For loop
        System.out.println("\n--- For Loops: Repeating Adventures ---");
        System.out.print("How many high-fives do you want? ");
        int highFives = explorer.nextInt();
        
        for (int i = 1; i <= highFives; i++) {
            System.out.println("High-five " + i + "!");
        }
        
        System.out.println("\n Congratulations, " + playerName + "! " +
                           "You've completed your first Java journey! ");
        
    }
}