import java.util.Scanner;
public class ChekVowelSwitch {

	public static void main(String[] args) 
	{// check vowels or not
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
			System.out.println(ch+" is a vowel");
			break;
		case 'A':
			System.out.println(ch+" is a vowel");
			break;
		case 'e':
			System.out.println(ch+" is a vowel");
			break;
		case 'E':
			System.out.println(ch+" is a vowel");
		break;
		case 'i':
			System.out.println(ch+" is a vowel");
			break;
		case 'I':
			System.out.println(ch+" is a vowel");
			break;
		case 'o':
			System.out.println(ch+" is a vowel");
			break;
		case 'O':
			System.out.println(ch+" is a vowel");
			break;
		case 'u':
			break;
		case 'U':
			System.out.println(ch+" is a vowel");
			break;
			default:
				System.out.println(ch+" is not a vowel");
			
		}

	}

}
