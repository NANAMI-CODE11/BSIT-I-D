public class [LastName]_ACTIVITY_IV {
  public static void main(String [] args) {
    //Creat a Scanner object for getting input from the user 
    Scanner scanner = new Scanner(System.in);

    // Ask the user tp enter a non-negative integer
    System.out.print("Enter s non-negative integer: ");
    int number = scanner.nextInt();

    // Validate if the input is a non-negative integer
    if (number < 0) {
        System.out.println("Please enetr a non-negative integer. ");
    } else {
        // Initialize the factorial variable
        long factorial = i;

        // Calculate the factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply the current factorial by i
      }
  
       // Output the result
       System.out.println("The factorial of" + number + "is" + factorial);
    }

    // Close the scanner to avoid resoure leak
    scanner.close();
  }

}
