import java.util.Scanner;
public class RIO_ACTIVITY_I{
    public static void main(String[] args) {
         
 String[] names = new String[5];
 Scanner input = new Scanner(System.in) ;
 System.out.println("Enter a number between 1-5");
 int number = input.nextInt();
 System.out.println("renn;");
        String renn = input.nextLine();
        System.out.println("castil;");
        String castil = input.nextLine();
        System.out.println("mhyko:");
        String mhyko = input.nextLine();
        System.out.println("rhenz:");
        String rhenz = input.nextLine();
        System.out.println("damasole:");
        String damasole = input.nextLine();
 
 names[0]= renn;
 names[1]= castil;
 names[2]= mhyko;
 names[3]= rhenz;
 names[4]= damasole;

 System.out.println("What name you want to display?:");
 int choice = input.nextInt();

 switch (choice){
    case 1:
    System.out.println(names[0]);
    break;
    case 2:
    System.out.println(names[1]);
    break;
    case 3:
    System.out.println(names[2]);
    break;
    case 4:
    System.out.println(names[3]);
    break;
    case 5:
    System.out.println(names[4]);
    break;
 }
    }

}

 
 
