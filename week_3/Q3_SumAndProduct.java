import java.util.Scanner;
public class Q3_SumAndProduct{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0,product=1;
        System.out.print("Enter four numbers here:");
        for(int i=0;i<4;i++){
            int num=sc.nextInt();
            sum=sum+num;
            product=product*num;
        }
        System.out.print("The sum is "+sum+" and produc is "+product);

    }
}
