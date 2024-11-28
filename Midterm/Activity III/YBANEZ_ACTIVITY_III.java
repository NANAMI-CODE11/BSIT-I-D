import java.util.Scanner;

public class YBANEZ_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds to countdown: ");
        int seconds = sc.nextInt();

        while (seconds >= 0) {
            System.out.println(seconds);
            seconds--;
        }

        sc.close();
    }
}