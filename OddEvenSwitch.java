import java.util.Scanner;

public class OddEvenSwitch {

	public static void main(String[] args) 
	{// check number is even or odd
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		switch(num%2)
		{
		case 1:
			System.out.println(num+" is odd");
			break;
		case 0:
			System.out.println(num+" is even ");
			break;
			default:
				System.out.println("number is netrual");
		}

	}

}
