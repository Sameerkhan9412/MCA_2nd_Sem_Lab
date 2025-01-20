import java.util.Scanner;
public class MyNumber{
	public static void main(String args[]){
		System.out.println("Enter number here");
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();

		 // Round to 2 decimal places
        	double numRound= Math.round(num);
        	double numCeil=Math.ceil(num);
		double numFloor=Math.floor(num);

		System.out.println("The output of "+num);
		System.out.println("NumRound value is"+numRound);
		System.out.println("NumCeil value is"+numCeil);
		System.out.println("NumFloor value is"+numFloor);

}
}