import java.util.Scanner;

public class Ifelseifprg {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter The second numnber");
		num2=sc.nextInt();
		System.out.println("Enter the third number");
		num3=sc.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" is lagest");
			
		}
		else if(num2>num1 && num2>num3)
			
		{
			System.out.println(num2+" is largest");
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println(num3+" is largest");
		}
		else
		{
			System.out.println("All numbes are equals");
		}
	}

}
