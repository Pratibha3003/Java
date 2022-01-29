import java.util.Scanner;

public class AreausingSwitch {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
// use switch case write menu driven program to calculate area of squre,circle.reactangle triangle;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("*****MENU******");
		
		System.out.println("1.Area of Square");
		System.out.println("2.Area of Reactangle");
		System.out.println("3.Area of Triangle");
		System.out.println("4.Area of Circle");
		System.out.println("Enter the choice");
		int no=sc.nextInt();
		switch(no)
		{
			
		case 1:
			System.out.println("Enter the side length");
			int a=sc.nextInt();
		 int area=a*a;
			System.out.println(area);
			break;
		case 2:
			System.out.println("Enter the  length & breadth");
			int l=sc.nextInt();
			int b=sc.nextInt();
			int area2=l*b;
			System.out.println(area2);
			break;
		case 3:
			System.out.println("Enter the  length ,breadth & heigth");
			int l1=sc.nextInt();
			int b1=sc.nextInt();
			int h1=sc.nextInt();
			int area3=(l1*b1*h1)/2;
			System.out.println(area3);
			break;
		case 4:
			System.out.println("Enter the radious");
			float pi=2.34f;
			float r=sc.nextFloat();
			float area4=pi*r*r;
			System.out.println(area4);
			break;
			default:
				System.out.println("invalid info");
			
			
			
			
			
			
			
		}
		
		
		
	}

}
