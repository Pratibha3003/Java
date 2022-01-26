package ArraysStrings;

import java.util.Scanner;

public class REverseString
{

	public static void main(String[] args)
	{
		/* Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.
		Sample Input: COMPUTER APPLICATIONS
		Sample Output: CMPTR PPLCTNS
		*/
		 Scanner sc=new Scanner(System.in);
	//	String str="computer applications";
		System.out.println("Enter the string ");
	String	str=sc.nextLine();
		
		
		int i;
		int len=str.length();
		
		String nstr=" ";
		
		for(i=0;i<len;i++)
			{
			  char ch=str.charAt(i);
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					continue;
				}
				nstr=nstr+ch;
			}
		      String res = nstr.toUpperCase();
				System.out.println("Reverse Word "+res);
	}

}
