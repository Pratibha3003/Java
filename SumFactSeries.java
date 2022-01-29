import java.util.Scanner;
public class SumFactSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		long fact=1;
		float sum=0.0f;
		System.out.println("ENter the value of n ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			sum=sum+((float)1/fact);
		}
		System.out.println("Sum of series is "+sum);

	}

}
