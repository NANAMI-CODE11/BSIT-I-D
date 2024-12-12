import java.util.Scanner;

public class GENON_FINAL_PROJECT {
    
    public static void main (String[]args){
        String  studentName= "JOAMIE B. GENON";
        String  studentBirthdate= "DECEMBER 31, 2003";
        int studentID= 20242055;
        int userPoint= 0;
        int mathResult= 0;
        String  grade= "";

        //Create a Scanner object for user input
         Scanner scanner = new Scanner(System.in);

        //Print student information
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Birthdate" + studentBirthdate);
        System.out.println("Student ID" + studentID);

        //Ask user for points
        System.out.println("Enter your points (1-100):");
        userPoints = scanner.nextInt();

        //Check if user points are within the valid range
        if(userPoints >= 1 && userPoints <= 100) {
            //Perform math operation
            mathResult = userPoints * 2;
            System.out.println("Math Result: " + mathResult);

            //Determine grade based on user points
            if(userPoints >= 95) {
                grade = "A";
            } else if (userPoints >= 90){
                grade = "B";
            } else if (userPoints >= 89){
                grade = "C";
            } else if (userPoints >= 79){
                grade = "D";
            } else { 
                grade = "F";
            }
            System.out.println("Grade: " + grade); 
        } else { 
            System.out.println("Invalid points. Please enter a value between 1 and 100");            
        }

        //Use switch statement to determine grade level
        int gradeLevel = userPoints / 10;
        switch(gradeLevel){
            case 10:
            case 9:
                System.out.println("Grade Level: Outstanding");
                break;
            case 8:
                System.out.printLn("Grade Level: Excellent");
                break;
            case 7:
                System.out.printLn("Grade Level: Very Good");
                break;
            case 6:
                System.ou.printLn("Grade Level: Poor");
                break:
            default:
                System.out.printLn("Grade Level: Failing");
                break;    

        }

        // Use while loop to print numbers from 1 to 10
        int i = 1;
        while (i <= 10){
            System.out.printLn("Number: " + i);
            i++;
        }
        
        // Use for loop to print numbers from 1 to 10
        for (int j = 1; j <= 10; j++){
            System.out.printLn("Number: " + j);
        }
    }
}