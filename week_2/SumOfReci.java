class SumOfReci{
	public static void main(String args[]){
		int n=10;
		float sum=0;
		for(float i=1;i<=n;i++){
			sum=sum+(1/i);
		}
		System.out.println("the sum of the term is  "+sum);
	}
}