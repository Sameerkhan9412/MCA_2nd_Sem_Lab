import java.util.Scanner;
class Q3 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Tempreture in F:");
		float num=s.nextFloat();
		float temp=(num-32)/1.8f;
		System.out.println("Temperature(F) :\t Temperature(C) ");
		System.out.println(num+"\t \t \t"+temp);	
	}

}