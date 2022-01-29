package Array;

public class RmoveDuplicates {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,2,1,4,};
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=i;j<arr.length;j++)
				
			{
				if(arr[i]!=arr[j])
					
				{
					System.out.println(arr[j]);
				}
			}
			//int[] b=new b[];
		//	for(i=0;i<b.length;i++)
		}	
	}//

}
