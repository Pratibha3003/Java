import java.util.Scanner;
public class Oddeven {

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" Number is a even ");
		}
		
/*	if(num%2!=0)
		{
			System.out.println(num+" Number is a  odd");
		}
		*/
		else
		{
			System.out.println(num+" Number is a  odd");
		}
	}

}
