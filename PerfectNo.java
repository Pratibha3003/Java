import java.util.Scanner;
public class PerfectNo {

	public static void main(String[] args)
	{
		
		/* WAP to accept a number and check whether the number is perfect or not .A number is said to 
		be perfect if the sum of the factors (including and excluding the number itself) is the same as the original 
		number.input 6.fac ,1,2,3;1+2+3=6
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int result=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				
				System.out.println(i);
			 result=result+i;
				
				
			
			}
			
		}
		if(num==result)
		{
		System.out.println("a perfect number");
		}
		else 
		{
			System.out.println("  not a perfect number");
		}
	}

}
