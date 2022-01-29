import java.util.Scanner;
public class PrimeNUmberFor
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		int i,j;
		int c=0;
		System.out.println("Enter the starting value ");
		int s=sc.nextInt();
		System.out.println("Enter the ending value ");
		int e=sc.nextInt();
		
		for(i=s;i<=e;i++)// <-prime values in between ranges.otherwise 1;
		{
			c=0;
			
			for(j=1;j<=i;j++)
			{
				
				if(i%j==0)
				{
						c++;	
					
				}
				
			}
			
			if(c==2)
			{
			/*	if(i==23 && i==29)// skip both number
				{
					continue;
				}
				*/
				
				if(i==73)// skip next prime number
				{
					break;
				}
				
			System.out.println(i );
			}
			
		}
		
	}

}
