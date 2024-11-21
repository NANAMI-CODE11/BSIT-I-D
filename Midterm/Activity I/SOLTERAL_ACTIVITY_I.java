import java.util.Scanner;

public class SOLTERAL_ACTIVITY_I { 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a color(red,green,black)");
    String color = sc.nextLine();

        int boxNumber = 0;
        switch (color) {
            case "red":
                boxNumber = 1;
                break;
            case "green":
                boxNumber = 2;
                break;
            case "black":
                boxNumber = 3;
                break;
            default:
System.out.println("Invalid color.Please enter red,green,or black.");
               
System.out.println(color);
System.out.println(boxNumber);
          sc.close();  
    }
    }
}

    