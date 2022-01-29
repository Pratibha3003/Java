import java.util.Scanner;
public class Voting {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter the age");
		age=sc.nextInt();
		if(age>18)
		{
			System.out.println(age+" is Eligible to vote");
		}
	/*	if (age<18)
		{
			System.out.println(age+" Not eligible to vote");
			
		}
		*/
		
		else
		{
			System.out.println(age+" Not eligible to vote");
		}
	}
	
}
