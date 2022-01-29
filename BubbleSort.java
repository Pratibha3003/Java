import java.util.Scanner;

public class BubbleSort 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	//	int a[]= {1,3,2,5,47,4};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teh array size");
		int n=sc.nextInt();
		int i,j;
		System.out.println("Enter the elements");
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int temp=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		System.out.println("After bubble sorting");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
