import java.util.Scanner;

public class Q4_printDigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 digit number:");
        int num=sc.nextInt();
        for(int i=0;i<4;i++){
            int digit=num%10;
            System.out.println(digit);
            num=num/10;
        }
    }
}
