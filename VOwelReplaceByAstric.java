package ArraysStrings;

public class VOwelReplaceByAstric {

	public static void main(String[] args)
	{
	/* Write a program in Java to accept a String in upper case and replace all the vowels present in the String with Asterisk (*) sign.
		Sample Input: "TATA STEEL IS IN JAMSHEDPUR"
		Sample output: T*T* ST**L *S *N J*MSH*DP*R
		*/
		String str="TATA STEEL IS IN JAMSHEDPUR";
		char a='*';
		int len=str.length();
		String s = " ";
		int i;
		for(i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
			s=s+'*';
			}
			else
			{
				s=s+ch;
			}
			
		}
		System.out.println(s);
		
		

	}

}
