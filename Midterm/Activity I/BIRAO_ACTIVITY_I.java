import java.util.Scanner;

public class BIRAO_ACTIVITY_I {

    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the color");
        String color = sc.nextLine();
    switch (color){
    case "Red":
        System.out.println("This goes to box #1");
        break;
    case "Green":
        System.out.println("This goes to box #2");
        break;
    case "Black":
        System.out.println("This goes to box #3");
        break;
        }
    }
}