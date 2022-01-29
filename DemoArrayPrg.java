
public class DemoArrayPrg {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("Size of array is ");
		System.out.println( arr.length);
		int sum=0,i;
		System.out.println("Sum of array numbers");
		for(i=0;arr[i]<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
		System.out.println("Average of arrays");
		float avg=((float)sum/arr.length);
		System.out.println(avg);
		
		
		
		
		
		




	}

}
