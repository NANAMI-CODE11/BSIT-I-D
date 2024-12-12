class RESTAURO_FINAL {
    public static void main(String[] args) {
        // Variable Declaration
        String studentName = "RESTAURO ALFEE";
        String studentBirthdate = "MAY 23 2005";
        int studentID = 20242050;
        String studentGender = "Female";

        // Print Student Information
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Birthdate: " + studentBirthdate);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Gender: " + studentGender);

        // Math Operations
        int mathScore = 90;
        int scienceScore = 85;
        int totalScore = mathScore + scienceScore;
        double averageScore = (double) totalScore / 2;

        System.out.println("\nMath Score: " + mathScore);
        System.out.println("Science Score: " + scienceScore);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);

        // User Input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("\nEnter your points (1-100): ");
        int userPoints = scanner.nextInt();

        // Conditional Statements
        if (userPoints >= 90) {
            System.out.println("Excellent!");
        } else if (userPoints >= 80) {
            System.out.println("Good!");
        } else if (userPoints >= 70) {
            System.out.println("Fair!");
        } else {
            System.out.println("Needs Improvement!");
        }

        // Switch Statement
        System.out.print("\nEnter your grade level (1-5): ");
        int gradeLevel = scanner.nextInt();
        switch (gradeLevel) {
            case 1:
                System.out.println("Grade Level: Freshman");
                break;
            case 2:
                System.out.println("Grade Level: Sophomore");
                break;
            case 3:
                System.out.println("Grade Level: Junior");
                break;
            case 4:
                System.out.println("Grade Level: Senior");
                break;
            case 5:
                System.out.println("Grade Level: Graduate");
                break;
            default:
                System.out.println("Invalid Grade Level!");
                break;
        }

        // Multiple Conditions
        System.out.print("\nEnter your age: ");
        int age = scanner.nextInt();
        if (age >= 18 && age <= 65) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }

        // While Loop
        int i = 1;
        while (i <= 5) {
            System.out.println("While Loop Iteration: " + i);
            i++;
        }

        // For Loop
        for (int j = 1; j <= 5; j++) {
            System.out.println("For Loop Iteration: " + j);
        }
    }
}