import java.util.Scanner;
public class SumofnumbersincondiWithoutScanner {

	public static void main(String[] args) 
	
	{
		/* You want to calculate the sum of all positive even numbers and the sum of all negative odd numbers from
		 *  the set of number .you can enter zero(0)to quite the program and thus it display the result .WAP to 
		 *  perform above task.
		 */
		 Scanner sc=new Scanner(System.in);
System.out.println(" Enter the number");
		 int num=1; 
		 int oddsum=0;
		 int evensum=0;
		 int oddnegsum=0;
		 int negevensum=0;
		 while(num!=0)
		 {    
			 int a=sc.nextInt();
			 num=a;
			 if(num==0)		 
		     {
				 break;
		     }
			 if(a%2==0)

		     {   if(a>0)

		         evensum=+(a);

		     }
			 if(a%2==0)

		     {   if(a<0)

		         negevensum=+(a);

		     }
			 if(a%2!=0)

		     {    if(a>0)
		    	 oddsum+=a;

		     }
			 if(a%2!=0)

		     {    if(a<0)
		    	 oddnegsum+=a;

		     }

			 

		  }

		 

		 System.out.println("Sum of even numbers = "+evensum);
		 System.out.println("Sum ofnegative even numbers = "+negevensum);
		 System.out.println("Sum of negative odd numbers = "+oddnegsum);

		 System.out.println("Sum of odd numbers = "+oddsum);

		 
	
	}

}
