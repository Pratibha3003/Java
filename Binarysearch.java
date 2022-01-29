package Array;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args)
	{
		// Binary Search array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();

		int[] arr=new int[n];
		System.out.println("Enter teh elements in ascending order");
		
		int i,j;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		 int l=0;
		 int h=n-1;
		 int mid=0;
		// int pos=0;
		 System.out.println("enter the search element");
		 int key=sc.nextInt();
		 mid = (l+h)/2;  
		
		 while( l <= h )
		 {  
		      if ( arr[mid] < key )
		      {  
		        l = mid + 1;     
		      }
		      else if ( arr[mid] == key )
		      {  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }
		      else
		    	  
		      {  
		         h = mid - 1;  
		      }  
		      mid = (l+h)/2;  
		   }  
		   if ( l > h ){  
		      System.out.println("Element is not found!");  
		   }  
	}

}
