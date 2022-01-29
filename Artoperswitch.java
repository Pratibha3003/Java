import java.util.Scanner;
public class Artoperswitch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		float num1=sc.nextFloat();
		System.out.println("Enter the second number");
		float num2=sc.nextFloat();
		
		
		
		
		
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divison");
		System.out.println("Enter the choice");
		
		int choice=sc.nextInt();
		
		
		
	
		switch(choice)
		{
		case 1:
		 float add=num1+num2;
		 
		
		System.out.println("Addition of two numbers "+add);
			break;
		case 2:
		   float sub=num1-num2;
			System.out.println("Substraction of two numbers "+sub);
			break;
		case 3:
			 float mul=num1*num2;
		System.out.println("Multiplication of two numbers "+mul);
			break;
		case 4:
		 float div=num1/num2;
		System.out.println("Division of two numbers "+div);
			break;
		default:
			System.out.println("Inlavlid");
			
		}
		//System.out.println(ans);
		
		

	}

}
