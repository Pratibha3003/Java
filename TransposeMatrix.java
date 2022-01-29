package TwoDiaArray;

public class TransposeMatrix {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[][] orignal= {{1,2,3},{4,5,6},{1,4,3}};
		int i,j;
		int[][] trans=new int[3][3];
		System.out.println("Original Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				
				System.out.print(orignal[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After Transpose Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				trans[i][j]=orignal[j][i];
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}

	}

}
