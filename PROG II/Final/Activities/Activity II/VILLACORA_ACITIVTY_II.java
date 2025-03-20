import java.util.Scanner;

public class VILLACORA_ACITIVTY_II{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the feet to be converted: ");
        int num = sc.nextInt();
        inch(num);
        
    }
    static void inch(int num){
        int result = num * 12;
        System.out.println("The converted output: " + result + " inches");
    
    }
}