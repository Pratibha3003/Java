package ArraysStrings;

public class RevSentence {

	public static void main(String[] args)
	{
		/* Write a program to accept a sentence. Display the sentence in reversing order of its word.
		Sample Input: Computer is Fun
		Sample Output: Fun is Computer
		*/
		String s="Fun is Computer";
		int i;
		//int len=s.length();
		String[] str=s.split(" ");
		String res=" ";
		
		for(i=str.length-1;i>=0;i--)
		{
			 res+=str[i]+" ";
			 
		}
		System.out.println(res);
	
	}

}
