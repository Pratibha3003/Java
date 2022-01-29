import java.util.Scanner;
public class Electricity {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Write a program to input the number of units consumed .Claculatr the electricity bill according the given rades
		/*units consumed        rate
		 * less than 100       80 piasa
		 */
		Scanner sc=new Scanner(System.in);
		int unit;
		float bill;
		System.out.println("Enter the Unite");
		unit=sc.nextInt();
		if(unit<100)
		{
		    bill=0.8f*unit;
			System.out.println(bill);
			
		}
		
		else if(unit>=100 && unit<=300 )
		{
		   bill=100*0.8f+(unit-100)*1;
			System.out.println(bill);
		}
		
		else if(unit>=300 && unit<=600)
		{
			bill=100*0.8f+200*1+(unit-300)*2.50f;
			System.out.println(bill);
		}
		else
		{
			System.out.println("no unit ");
		}
	}

}
