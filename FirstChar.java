
public class FirstChar
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s="Mohandas Karamchandra Gandhi";
		String st=" ";
		
		for(int i=0;i<s.length();i++)
		{
			if(i==0)
			{
				st=st+s.charAt(i)+".";
				
			}
			
			else if(s.charAt(i)==' ')
			{
				st=st+s.charAt(i+1)+".";
				continuew
			}
			
			
			
		}
		
		System.out.println(st);
		
	}
	

}
