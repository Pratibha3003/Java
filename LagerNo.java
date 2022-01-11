import java.util.Scanner;
public class LagerNo 
{
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a,b;
	
	System.out.println("Enter first number");
	a=sc.nextInt();
	
	System.out.println("Enter second number");
	b=sc.nextInt();
	
	int lagerno=(a>b?a:b);
	System.out.println(lagerno);
	
	int smallno=(a<b)?a:b;
	System.out.println(smallno);
}
 
 
}
