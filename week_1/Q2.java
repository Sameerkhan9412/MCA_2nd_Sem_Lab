import java.util.Scanner;
public class Q2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fist Number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2=sc.nextInt();
		System.out.println("All Operations:");
		System.out.println("Sum :"+(num1+num2));
		System.out.println("Difference:"+(num1-num2));
		System.out.println("Product:"+(num1*num2));
		System.out.println("Quotient:"+(num1/num2));	
		if(num1>num2){
			System.out.println("The maximum number is "+num1+"And Minimum is"+num2);
		}
		else{
			System.out.println("The Maximum num is"+num2+"and Minimum is "+num1);
		}
	}
}