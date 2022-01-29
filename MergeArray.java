import java.util.Scanner;
public class MergeArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the first array size ");
		int len1=sc.nextInt();
		int[] arr1=new int[len1];
		for(i=0;i<len1;i++)
		{
		  arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the second array size ");
		int len2=sc.nextInt();
		int arr2[]=new int[len2];
		for(i=0;i<len2;i++)
		{
		  arr2[i]=sc.nextInt();
		}
		
		System.out.println("Third merge array");
	//	int arr3[]=new int[len3];
		int len3=len1+len2;
		int arr3[]=new int[len3];
		
		for(i=0;i<len1;i++)
		{
			arr3[i]=arr1[i];
			
		}
		for(i=0;i<len2;i++)
		{
			arr3[len1+i]=arr2[i];
			
		}
		System.out.println("Combining of two array elements ");
		for(i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
		
		//combine 4th array elements
		System.out.println("Enter the fourth array size");
		int len4=sc.nextInt();
		int[] arr4=new int[50];
		System.out.println("Enter the array elements");
		
		for(i=0;i<len4;i++)
		{
			arr4[i]=sc.nextInt();
		}
	
		int[] arr5=new int[50];
		int len5=len4+len3;
		for(i=0;i<len3;i++)
		{
			arr5[i]=arr3[i];
		}
		System.out.println("Combining one or array");
		for(i=0;i<arr5.length;i++)
		{
			  arr5[len3+i]=arr4[i];
		}
			//System.out.println();
		for(i=0;i<arr5.length;i++)
		{
			System.out.println(arr5[i]);
		}
			
			
			
			
			
			
		
		
	}

}
