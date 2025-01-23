import java.util.Scanner;

public class CODENIERA_ACTIVITY_II {
    public static void main(String[] args) {
        int [] scores = new int[10];
        Scanner sc = new Scanner (System.in);

        
        System.out.println("Enter 10 Scores");

        for (int i = 0; i < 10; i++){
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        int sum = 0;
        double average;
       



        int length = scores.length;

        for (int score: scores){
            sum += score;   
        }

        average = sum / length;

        System.out.println(" ");
        System.out.println("The average is " + average);

    }
}