package Array;

import java.util.Scanner;

public class SmalestNo
{

	public static void main(String[] args)
	{
	//	int arr[]= {5,3,4,1,2};
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the array size number");
		int n=sc.nextInt();
		System.out.println("Enter the elements  ");
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("FInd smallest number from array list");
		
		int min=arr[0];
		for(i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
	
			}
		}
		System.out.println(min);
		
	}

}
