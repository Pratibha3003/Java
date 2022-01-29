package ArraysStrings;

public class ReplaceChar {

	public static void main(String[] args) 
	{
		/*Write a program to accept a word and convert it into lower case, if it is in upper case.
		 *  Display the new word by replacing only the vowels with the letter following it.
		Sample Input: computer
		Sample Output: cpmpvtfr
		*/
		String str="computer";
		int len=str.length();
		int i;
		char ch;
		String nstr="";
		for(i=0;i<str.length();i++)
		{
			 ch=str.charAt(i);
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||  str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				char ch1=ch+1;
				nstr=nstr+ch1;
			}
			else
			{
				nstr=nstr+ch;
			}
			 
		}
		System.out.println(nstr);
		 
		
		
	}

}
