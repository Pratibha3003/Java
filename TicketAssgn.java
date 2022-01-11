import java.util.Scanner;

public class TicketAssgn {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purches  amount ");
		double amount=sc.nextInt();
		int d=0;
		if(amount<=25001)
		{
			//System.out.println(" 2% discount ");
			d=2;
		}
		else if(25001<=amount && amount<=35000)
		{
			//System.out.println(" 10% discount ");
			d=10;

		}
		else if(35001<=amount && amount<=55000)
		{
			//System.out.println(" 12% discount ");
			d=12;

		}
		else if(55001<=amount && amount<=70000)
		{
			//System.out.println(" 16% discount ");
			d=16;
		}
		else if(70000<amount)
		{
		//	System.out.println(" 18% discount ");
			d=18;
			
		}
		else
		{
			System.out.println("Amount is not in range");
		}

		double discAmt = amount * d / 100.0;
        double finalAmt = amount - discAmt;
        
        System.out.println("Purchase Amount: " + amount);
        System.out.println("Final Payable Amount: " + finalAmt);
        
	}

}
