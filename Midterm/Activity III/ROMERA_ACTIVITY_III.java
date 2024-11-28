
    
import java.util.Scanner;
public class ROMERA_ACTIVITY_III {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the number of seconds to countdown: ");
        int seconds = scanner.nextInt();
        
        while (seconds > 0) {
            System.out.println(seconds); 
            seconds--; 
        }
        System.out.println("0");
            scanner.close();
        }
    }

