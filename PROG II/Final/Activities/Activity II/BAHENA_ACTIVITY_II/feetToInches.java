
import java.util.Scanner;

public class feetToInches{

public static int feeToInches(int feet){
    return feet1*12;
}

    public static void main(String[] args);

    Scanner scanner = new scanner(System.in);
    System.out.println("Enter the number of feet");


      try{
        int feet = scanner.nextInt();
        int inches = feeToInches(feet);
        System.out.println("Inches:+inches");
      }catch
    (NumberFormatException e) {
        System.out.println("Invalid input. Please put an integer");
    }finally{

       scanner.close();
         
    }
}