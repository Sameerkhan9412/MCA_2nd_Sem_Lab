import java.util.Scanner;

class Part2 {
    public static void main(String args[]) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int flag = 1; // Start with 1
        
        // Loop through rows
        for (int i = 1; i <= num; i++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(flag + " "); // Print flag value
                // Alternate flag value between 1 and 0
                if (flag == 1) {
                    flag = 0;
                } else {
                    flag = 1;
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
