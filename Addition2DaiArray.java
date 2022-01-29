package TwoDiaArray;

public class Addition2DaiArray {

	public static void main(String[] args)
	{
		// Addition 
		int[][] a= {{1,2,3},{4,5,6},{5,0,3}};
		int[][] b= {{1,4,8},{5,0,3},{4,5,6}};
		int i,j;
		int[][]  c= new int[3][3];
		System.out.println("Addition of matrix a & b");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Substraction of matrix a & b");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
