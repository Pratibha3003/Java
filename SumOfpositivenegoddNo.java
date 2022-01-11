import java.util.Scanner;
public class SumOfpositivenegoddNo {

	public static void main(String[] args) 
	{
		/* You want to calculate the sum of all positive even numbers and the sum of all negative odd numbers from
		 *  the set of number .you can enter zero(0)to quite the program and thus it display the result .WAP to 
		 *  perform above task.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index  numbers");
		int n=sc.nextInt();
		int arr[]=new int [n];
		int i,sum=0;
		System.out.println("Enter the   numbers");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for( i=0;i<n;i++)
		{
		System.out.println(arr[i]);
		}
		if(arr[i]%2==0)
		{
			sum=sum+arr[i];
			System.out.println("SUm of all positive numbers"+sum);
		}
		else
		{
			sum=sum+arr[i];
			System.out.println("Sum of all odd numbers"+sum);
		}
		
		
		
	}

}
