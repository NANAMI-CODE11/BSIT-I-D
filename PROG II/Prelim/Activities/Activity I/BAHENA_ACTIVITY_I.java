import java.util.Scanner;
class main BAHENA_ACTIVITY I {}
public class NameSelector{
    public static void main(String[] args){


     String[] names = {"Mark Zuckerberg", "Elon Musk", "Jeff Bezos","Bill Gates","Larry Page"};


    Scanner scanner = new Scanner(System.in);


    for (int i = 0; i < 5; i++) {
        System.out.println("Enter a number (1-5) to select a name:");


          int index = 
    scanner.nextInt();
    
    
          if (index >= 1 && index <= 5) {
System.out.println("Please enter a number between 1 and 5");            
                        }
                }    
             scanner.close();
        }
}
