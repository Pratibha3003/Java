package TwoDiaArray;

public class Demo2DiaArray {

	public static void main(String[] args) 
	{
		int[][] arr= {{1,2,3},{4,5,6}};
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);
			}
		}
		

	}

}
