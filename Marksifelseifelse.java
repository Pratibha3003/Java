import java.util.Scanner;
public class Marksifelseifelse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks;
		System.out.println("Enter the marks");
		marks=sc.nextInt();
		if(marks>=90 && marks<=100)
		{
			System.out.println(marks+" A grade");
		}
		else if(marks>=60 && marks<=89)
		{
			System.out.println(marks+" B grade");
		}
		else if(marks>=40 && marks<=59)
		{
			System.out.println(marks+" C grade");
			
		}
		else if(marks>=0 && marks<= 39)
		{
			System.out.println(marks+" D Grade");
			
		}
		else
		{
			System.out.println(" Entered vlaue is invalid");
		}

	}

}
