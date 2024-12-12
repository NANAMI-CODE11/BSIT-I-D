import java.util.Scanner

public class REGASAJO_ACTIVITY_III {

    public static void main(String[] args) {
        // Creat a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of second to countdown from
        Sytem.out.print("Enter the number of seconds: ");
        int second = scanner.nextint();

        // Start a countdown from the input number to 1
        for (int i = second; i > 0; i--) {
            System.out.println(i); // Print the current countdown value
            try {
                Thread.sleep(1000); // Wait for 1 second before printing the next number {
            } catch (InterruptedException e) {
                e.printstackTrace();

            }
        }

        // Print 0 after the countdown is complete
        System.out.println(0);
        scanner.close();
    }
}}