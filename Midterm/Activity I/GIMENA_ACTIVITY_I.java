import java.util.Scanner;
class GIMENA_ACTIVITY_I{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input color");
        String color = sc.nextLine();

        switch(color) {
            case "red":
            
            System.out.println("BOX 1");

            break;

            case "green":

            System.out.println("BOX 2");

            break;

            case "black":

            System.out.println("BOX 3");

            break;
            
        }
    }
}