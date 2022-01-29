import java.util.Scanner;
public class ArmstrongNO {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int  num, rem, result = 0;

		num = n;

        while (n != 0)
        {
            rem = n % 10;
            result += (rem*rem*rem);
            n /= 10;
        }

        if(result == num)
            System.out.println(num+ " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
		
	}


