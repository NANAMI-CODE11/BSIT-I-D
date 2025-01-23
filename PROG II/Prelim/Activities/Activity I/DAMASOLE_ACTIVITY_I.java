import java.util.Scanner;
public class DAMASOLE_ACTIVITY_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        String name1 = sc.nextLine();
        System.out.println("Enter name 1");
        String name2 = sc.nextLine();
        System.out.println("Enter Name 2");
        String name3=sc.nextLine();
        System.out.println("Enter Name 3");
        String name4 = sc.nextLine();
        System.out.println("Enter Name 4");
        String name5 = sc.nextLine();
        System.out.println("Enter Name 5");
        String name  = sc.nextLine();
        names[0] = name1;
        names[1] = name2;
        names[2] = name3;
        names[3] = name4;
        names[4] = name5;

        System.out.println("Choose a name you want to display in the screen:");
        int choose = sc.nextInt();  
        
        switch (choose) {
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