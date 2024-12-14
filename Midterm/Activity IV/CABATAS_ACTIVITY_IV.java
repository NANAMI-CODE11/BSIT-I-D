import java.util.Scanner;
class CABATAS_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer:");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i=1; i<=num; i++) {
            factorial*=i;
        }
        
    }
}
