
public class LabelledLoop {

	public static void main(String[] args)
	{
		int i,j ;
		outer:
			for(i=1;i<4;i++)
			{
				inner:
					for(j=1;j<3;j++)
					{
						if(j==2)
						continue outer;
					}
			}
		System.out.println();

	}

}
