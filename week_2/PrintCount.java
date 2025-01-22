import java.util.Scanner;

class PrintCount{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Here:");
		int num=sc.nextInt();
		int div,rem,temp,countEven=0,countOdd=0;
		while(num>0){
			temp=num%10;
			if(temp%2==0){
				countEven++;
			}
			else{
				countOdd++;
			}
			num=num/10;
		}
		System.out.println("Even Count Is "+countEven);
		System.out.println("Even Odd Is "+countOdd);


}

}