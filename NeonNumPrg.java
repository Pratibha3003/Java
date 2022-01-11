import java.util.Scanner;
public class NeonNumPrg {

	public static void main(String[] args) 
	{
		/* WAP to enter number and check whether the number is Neon or not .A number is said to be Neon if 
		 * sum of digits of the square of the number is equal to the number itself,
		 */
		  Scanner ob=new Scanner(System.in);
	        System.out.println("Enter the number to check neon number or not");
	        int num=ob.nextInt();
	        int squa=num*num;
	        int sum=0;
	        while(squa!=0)//Loop to find the sum of digits.
	        {
	            int a=squa%10;
	            sum=sum+a;
	            squa=squa/10;
	        }
	        if(sum==num)
	        {
	            System.out.println(num+" is a Neon Number.");
	        }
	        else
	        {
	            System.out.println(num+" is not a Neon Number.");

	        }

}
}
