package ArraysStrings;

public class MaxiNoVowels {

	public static void main(String[] args) 
	{
		/*Write a program to input a sentence and display the word of the sentence that 
		 * contains maximum number of vowels.
		Sample Input: HAPPY NEW YEAR
		Sample Output: The word with maximum number of vowels: YEAR
		*/
		String str="HAPPY NEW YEAR";
		int len=str.length();
		int i;
		//char[] ch=str.toCharArray();
	//	System.out.println(ch);
		int c=0;
		char ch;
		String nstr="";
		do {
			
		
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
			 if(i==0)
			 {
				 c++;
			 }
			 else if(i+1)
			 {
				 c++;
			 }
			
			}
		
			
				
		}
		System.out.println(c);
		

		
	}
	}

