import java.util.Scanner;
public class IfElsegiftassgn {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to paid");
		int amount=sc.nextInt();
		if(amount<=2000)
		{
			System.out.println(" 5% discount & gift as Wall Clock");
			
		}
		else if(2001<=amount && amount<=5000)
		{
			System.out.println(" 10% discount & gift as School Bag");

		}
		else if(5001<=amount && amount<=10000)
		{
			System.out.println(" 15% discount & gift as Electric Iron");
		}
		else if(10000<amount)
		{
			System.out.println(" 20% discount & gift as Wrist Watch");
		}
		else
		{
			System.out.println("Amount is not in range");
		}
	}

}
