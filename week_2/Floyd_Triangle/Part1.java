import java.util.Scanner;

class Part1{
    public static void main(String args[]) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int value = 1;

        while (i < num) {
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
            i++; // Increment 'i' to move to the next row
        }
    }
}
