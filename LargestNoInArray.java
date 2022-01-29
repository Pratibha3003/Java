import java.util.Scanner;

public class LargestNoInArray {

	public static void main(String[] args)
	{
	//	int arr[]= {23,436,41,5,36,210};
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int i, max=arr[0];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		
		System.out.printf("Largest of all array elements is %d ",max);
		

		
	}

}
