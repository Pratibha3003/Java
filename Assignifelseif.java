import java.util.Scanner;
public class Assignifelseif {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char grade;
		
		System.out.println("Enter the grade");
		grade=sc.next().charAt(0);
		
		if(grade=='A' || grade=='a')
		{
			System.out.println("Marks Range 90-100");
			
		}
		else if(grade=='B' || grade=='b')
		{
			System.out.println("Marks range 60-89");
		}
		
		else if(grade=='C' || grade=='c')
		{
			System.out.println("Marks range 40-59");
			
		}
		else if(grade=='D' || grade=='d')
		{
			System.out.println("Marks range 0-39");
		}
		
		else
		{
			System.out.println("Invalid grade");
		}
	}

}
