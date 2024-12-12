
import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {
        // Declare variables
        String studentName = "ALFEE RESTAURO";
        int studentID = 20242050;
        String studentBirthdate = "MAY 23 2005";
        int studentAge = 19; // Calculated based on birthdate
        double studentGPA = 3.8;

        // Print student information
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Birthdate: " + studentBirthdate);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student GPA: " + studentGPA);

        // Take user input for points
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter points earned in Math: ");
        int mathPoints = scanner.nextInt();
        System.out.print("Enter points earned in Science: ");
        int sciencePoints = scanner.nextInt();
        System.out.print("Enter points earned in English: ");
        int englishPoints = scanner.nextInt();

        // Calculate total points
        int totalPoints = 300;
        int mathPercentage = (mathPoints * 100) / 100;
        int sciencePercentage = (sciencePoints * 100) / 100;
        int englishPercentage = (englishPoints * 100) / 100;

        // Print points information
        System.out.println("Points Earned in Math: " + mathPoints);
        System.out.println("Points Earned in Science: " + sciencePoints);
        System.out.println("Points Earned in English: " + englishPoints);
        System.out.println("Math Percentage: " + mathPercentage + "%");
        System.out.println("Science Percentage: " + sciencePercentage + "%");
        System.out.println("English Percentage: " + englishPercentage + "%");

        // Conditional statement
        if (mathPoints >= 80 && sciencePoints >= 80 && englishPoints >= 80) {
            System.out.println("Congratulations, you passed all subjects!");
        } else {
            System.out.println("Sorry, you failed one or more subjects.");
        }

        // Switch statement
        System.out.print("Enter your grade level (1-5): ");
        int gradeLevel = scanner.nextInt();
        switch (gradeLevel) {
            case 1:
                System.out.println("You are a freshman.");
                break;
            case 2:
                System.out.println("You are a sophomore.");
                break;
            case 3:
                System.out.println("You are a junior.");
                break;
            case 4:
                System.out.println("You are a senior.");
                break;
            case 5:
                System.out.println("You are a graduate student.");
                break;
            default:
                System.out.println("Invalid grade level.");
                break;
        }

        // Multiple conditions
        if (mathPoints >= 90 && sciencePoints >= 90 && englishPoints >= 90) {
            System.out.println("You are eligible for a scholarship.");
        } else if (mathPoints >= 80 && sciencePoints >= 80 && englishPoints >= 80) {
            System.out.println("You are eligible for a partial scholarship.");
        } else {
            System.out.println("You are not eligible for a scholarship.");
        }

        // While loop
        int i = 1;
        while (i <= 5) {
            System.out.println("Loop iteration: " + i);
            i++;
        }

        // For loop
        for (int j = 1; j <= 5; j++) {
            System.out.println("Loop iteration: " + j);
        }

        // Math operations
        double averagePoints = (mathPoints + sciencePoints + englishPoints) / 3.0;
        System.out.println("Average Points: " + averagePoints);
    }
}
