import java.util.Scanner;
public class DAMASOLE_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to convert into inches");

        double feet = sc.nextDouble();

        double inches = feet * 12;

        System.out.println(feet + " feet is equal to " + inches);
        
    }
}
