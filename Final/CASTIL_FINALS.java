import java.util.Scanner;

public class CASTIL_FINALS {
    public static void main(String[] args) {
        // Available products and their prices
        String[] products = {"Apple", "Banana", "Orange", "Milk", "Bread", "Eggs"};
        double[] prices = {0.50, 0.30, 0.40, 2.50, 1.80, 2.00};
        int[] stock = {50, 40, 45, 30, 25, 35};
        
        // Shopping cart to store selected items
        String[] cart = new String[100];
        double[] cartPrices = new double[100];
        int cartIndex = 0;
        
        // User input scanner
        Scanner scanner = new Scanner(System.in);
        
        // Welcome message
        System.out.println("Welcome to Our Shopping Program!");
        
        // Main shopping loop
        while (true) {
            // Display menu
            System.out.println("\nAvailable Products:");
            for (int i = 0; i < products.length; i++) {
                System.out.printf("%d. %s - $%.2f (Stock: %d)%n", 
                    i + 1, products[i], prices[i], stock[i]);
            }
            
            // Prompt for action
            System.out.println("\nChoose an action:");
            System.out.println("1. Add product to cart");
            System.out.println("2. View cart");
            System.out.println("3. Remove product from cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            
            // Get user choice
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            
            // Handle user choice using switch case
            switch (choice) {
                case 1: // Add product
                    System.out.print("Enter product number to add: ");
                    int productIndex = scanner.nextInt() - 1;
                    
                    // Validate product selection
                    if (productIndex >= 0 && productIndex < products.length) {
                        // Check stock availability
                        if (stock[productIndex] > 0) {
                            // Add to cart
                            cart[cartIndex] = products[productIndex];
                            cartPrices[cartIndex] = prices[productIndex];
                            cartIndex++;
                            
                            // Reduce stock
                            stock[productIndex]--;
                            
                            System.out.println(products[productIndex] + " added to cart!");
                        } else {
                            System.out.println("Sorry, this product is out of stock!");
                        }
                    } else {
                        System.out.println("Invalid product number!");
                    }
                    break;
                
                case 2: // View cart
                    if (cartIndex == 0) {
                        System.out.println("Your cart is empty!");
                    } else {
                        System.out.println("\nYour Cart:");
                        double total = 0;
                        for (int i = 0; i < cartIndex; i++) {
                            System.out.printf("%s - $%.2f%n", cart[i], cartPrices[i]);
                            total += cartPrices[i];
                        }
                        System.out.printf("Total: $%.2f%n", total);
                    }
                    break;
                
                case 3: // Remove product
                    if (cartIndex == 0) {
                        System.out.println("Your cart is empty!");
                    } else {
                        System.out.print("Enter product number to remove: ");
                        int removeIndex = scanner.nextInt() - 1;
                        
                        if (removeIndex >= 0 && removeIndex < cartIndex) {
                            // Find the product in the original products array
                            for (int i = 0; i < products.length; i++) {
                                if (products[i].equals(cart[removeIndex])) {
                                    stock[i]++; // Restore stock
                                    break;
                                }
                            }
                            
                            // Shift cart items
                            for (int i = removeIndex; i < cartIndex - 1; i++) {
                                cart[i] = cart[i + 1];
                                cartPrices[i] = cartPrices[i + 1];
                            }
                            cartIndex--;
                            
                            System.out.println("Product removed from cart!");
                        } else {
                            System.out.println("Invalid cart item number!");
                        }
                    }
                    break;
                
                case 4: // Checkout
                    if (cartIndex == 0) {
                        System.out.println("Your cart is empty!");
                    } else {
                        double total = 0;
                        System.out.println("\n--- Checkout ---");
                        for (int i = 0; i < cartIndex; i++) {
                            System.out.printf("%s - $%.2f%n", cart[i], cartPrices[i]);
                            total += cartPrices[i];
                        }
                        
                        // Apply discounts based on total
                        if (total > 20) {
                            total *= 0.9; // 10% discount
                            System.out.println("10% discount applied!");
                        }
                        
                        System.out.printf("Final Total: $%.2f%n", total);
                        System.out.println("Thank you for shopping!");
                        
                        // Reset cart
                        cartIndex = 0;
                    }
                    break;
                
                case 5: // Exit
                    System.out.println("Thank you for visiting! Goodbye!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}