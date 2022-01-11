import java.util.Scanner;
public class NumContinuePattrn
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int i,j,k=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k+ " ");
				k=k+1;
			}
			System.out.println();
			
		}
		
	}
}

	

