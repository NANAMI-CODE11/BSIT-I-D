import java.util.Scanner;

class RIO_ACTIVITY_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a color between Red,Green,Black:");
        String color = sc.nextLine();
        switch(color) {
            case "Red":
            System.out.println("This goes to box 1");
            break;
            case "Green":
            System.out.println("This goes to box 2");
            break;
            case "Black":
            System.out.println("This goes to box 3");
            break;
            default:
            System.out.println("Enter the choices that are shown");

        }
        



    }
}

