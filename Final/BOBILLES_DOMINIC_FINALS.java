import java.util.Scanner;

public class StudentInformationSystem {

    public static void main(String[] args) {

        // Declare variables
        String studentName = "Dominic Bobilles";
        int studentID = 20242258;
        String birthdate = "November 11, 2001";
        int age = 22; // Assuming current year is 2024
        double gpa = 3.5;

        // Print student information
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        // Take user input for points
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter points earned: ");
            int pointsEarned = scanner.nextInt();

            // Calculate total points
            int totalPoints = 100;
            double percentage = (pointsEarned / (double) totalPoints) * 100;

            // Print percentage
            System.out.println("Percentage: " + percentage + "%");

            // Conditional statement
            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else if (percentage >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }

            // Switch statement
            System.out.print("Enter a grade (A, B, C, D, F): ");
            String grade = scanner.next().toUpperCase();
            switch (grade) {
                case "A":
                    System.out.println("Excellent!");
                    break;
                case "B":
                    System.out.println("Good!");
                    break;
                case "C":
                    System.out.println("Fair!");
                    break;
                case "D":
                    System.out.println("Poor!");
                    break;
                case "F":
                    System.out.println("Failing!");
                    break;
                default:
                    System.out.println("Invalid grade!");
            }

            // Multiple conditions
            if (age >= 18 && gpa >= 3.0) {
                System.out.println("Eligible for graduation!");
            } else {
                System.out.println("Not eligible for graduation!");
            }

            // While loop
            int i = 1;
            while (i <= 5) {
                System.out.println("Iteration " + i);
                i++;
            }

            // For loop
            for (int j = 1; j <= 5; j++) {
                System.out.println("Iteration " + j);
            }
        } finally {
            scanner.close();
        }
    }
}
           
