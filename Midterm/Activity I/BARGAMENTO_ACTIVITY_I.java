import java.util.Scanner;
public class BARGAMENTO_ACTIVITY_I {
    public static void main(String [] args){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the color");
    
    String color = sc.nextLine();
    switch (color){
    case "red":
        System.out.println("This goes to Box #1");
        break;
    case "green":
        System.out.println("This goes to Box #2");
        break;
    case "black":
        System.out.println("This goes to Box #3");
        break;
    
    }

}

}


