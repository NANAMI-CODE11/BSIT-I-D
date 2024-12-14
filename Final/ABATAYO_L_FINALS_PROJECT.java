import java.util.Scanner;

public class ABATAYO_L_FINALS_PROJECT {
    
    public static void main(String[] args) {
        // Declaring variables with appropriate types
        String studentName = "Leonard Abatayo";
        String studentBirthdate = "May 08 2006";
        int studentID = 20242044;
        double studentGrade = 0.0;  // Initial grade is 0
        int currentYear = 2024;
        int studentAge = currentYear - 2006;  // Calculate student age

        // Print out student information
        System.out.println("Student Information:");
        System.out.println("Name: " + studentName);
        System.out.println("Birthdate: " + studentBirthdate);
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + studentAge);

        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user for the student's grade
        System.out.print("Enter the student's grade (0 - 100): ");
        studentGrade = scanner.nextDouble();

        // Using conditionals to check the grade
        if (studentGrade >= 90) {
            System.out.println(studentName + " is an excellent student!");
        } else if (studentGrade >= 70) {
            System.out.println(studentName + " is a good student.");
        } else if (studentGrade >= 50) {
            System.out.println(studentName + " is passing, but needs improvement.");
        } else {
            System.out.println(studentName + " needs to work harder.");
        }

        // Using a switch statement to print a message based on the grade range
        System.out.println("\nGrade Evaluation:");
        int gradeCategory = (int) (studentGrade / 10); // Group the grade into a category

        switch (gradeCategory) {
            case 10:
            case 9:
                System.out.println("Grade: A (Excellent)");
                break;
            case 8:
                System.out.println("Grade: B (Good)");
                break;
            case 7:
                System.out.println("Grade: C (Fair)");
                break;
            case 6:
                System.out.println("Grade: D (Passable)");
                break;
            default:
                System.out.println("Grade: F (Fail)");
                break;
        }

        // While loop: Counting down from student's age
        System.out.println("\nCounting down from " + studentAge + " years old:");
        int countDown = studentAge;
        while (countDown > 0) {
            System.out.println("Year " + countDown);
            countDown--;
        }

        // For loop: Calculate the sum of all grades for a hypothetical subject over 5 years
        double totalGrades = 0;
        System.out.println("\nCalculating total grades for the next 5 years:");
        for (int year = 1; year <= 5; year++) {
            System.out.print("Enter the grade for year " + year + ": ");
            double yearGrade = scanner.nextDouble();
            totalGrades += yearGrade;
        }

        // Calculate average grade for the 5 years
        double averageGrade = totalGrades / 5;
        System.out.println("Average grade over 5 years: " + averageGrade);

        // Additional condition to check if the average grade is passing
        if (averageGrade >= 50) {
            System.out.println("The student is on track for success.");
        } else {
            System.out.println("The student needs to improve their grades.");
        }

        // Closing the scanner object
        scanner.close();
    }
}
