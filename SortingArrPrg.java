import java.util.Scanner;

public class SortingArrPrg {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		int i;
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		System.out.println("Enter the Elements of an array");
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the element to search");
		int x=sc.nextInt();
		int pos=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				//c++; 
				
				
			pos=i+1;
			break;
			
				
			}
		}
		
		if(pos>0)//pos>0 
		{
		System.out.println(x+" Element is Found at position in array"+pos);
		}
		else
		{
			System.out.println(x+" Element is not found");
		}
		
	//	System.out.println(x+" Elemts is avalible in array  "+c+" Time");

	}

}
