import java.util.Scanner;
class SumOfEven{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value:");
		int num=sc.nextInt();
		int i=2;
		while(i<=num){
			System.out.println(i);	
			i=i+2;
		}

	}
}