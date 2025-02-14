import java.util.Scanner;

public class LARGEST {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Find the largest number
        int largest = findLargest(num1, num2, num3);
        
        // Display the largest number
        System.out.println("The largest number is: " + largest);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to find the largest among three numbers
    public static int findLargest(int a, int b, int c) {
        // Compare the numbers and return the largest one
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
