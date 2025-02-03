import java.util.Scanner;

public class Q1_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int first = 0, second = 1, next, i = 1;

        // Print the first Fibonacci number
        System.out.print("Fibonacci Series up to " + n + " terms: ");

        // If n is at least 1, print the first Fibonacci number
        if (n >= 1) {
            System.out.print(first + " ");
        }
        
        // If n is at least 2, print the second Fibonacci number
        if (n > 2) {
            System.out.print(second + " ");
        }

        // Use a do-while loop to print the rest of the Fibonacci numbers
        do {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            i++;
        } while (i < n-1);
    }
}
