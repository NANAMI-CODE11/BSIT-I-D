import java.util.Scanner;

/**
 * This program demonstrates various Java programming concepts.
 * 
 * @author TOSHE MECCA MUNASQUE
 * @version 1.0
 */

public class StudentProgram {

    // Define variables
    private static String studentName = "TOSHE MECCA MUNASQUE";
    private static String studentBirthdate = "JUNE 15 2006";
    private static int studentID = 20242049;

    public static void main(String[] args) {

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Print student information
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Birthdate: " + studentBirthdate);
        System.out.println("Student ID: " + studentID);

        // Take user points
        System.out.print("Enter your points (out of 100): ");
        int userPoints = scanner.nextInt();

        // Calculate grade based on points
        char grade = calculateGrade(userPoints);

        // Print grade
        System.out.println("Your grade is: " + grade);

        // Use switch statement to determine grade level
        System.out.println("Your grade level is: " + determineGradeLevel(grade));

        // Use multiple conditions to check if student is eligible for scholarship
        if (userPoints >= 90 && grade == 'A') {
            System.out.println("You are eligible for a scholarship!");
        } else {
            System.out.println("You are not eligible for a scholarship.");
        }

        // Use while loop to print numbers from 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Use for loop to print numbers from 1 to 10
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        // Close the Scanner object
        scanner.close();
    }

    /**
     * Calculates the grade based on the given points.
     * 
     * @param points the points to calculate the grade from
     * @return the calculated grade
     */
    private static char calculateGrade(int points) {
        if (points >= 90) {
            return 'A';
        } else if (points >= 80) {
            return 'B';
        } else if (points >= 70) {
            return 'C';
        } else if (points >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    /**
     * Determines the grade level based on the given grade.
     * 
     * @param grade the grade to determine the level from
     * @return the determined grade level
     */
    private static String determineGradeLevel(char grade) {
        switch (grade) {
            case 'A':
                return "Excellent";
            case 'B':
                return "Good";
            case 'C':
                return "Fair";
            case 'D':
                return "Poor";
            case 'F':
                return "Failing";
            default:
                return "Unknown";
        }
    }
}

