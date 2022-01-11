import java.util.Scanner;
public class HappyNumPrg {

	public static void main(String[] args)
	{
		// Happy NUmber Program
		Scanner in = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int num1 = in.nextInt();
        int sum1 = 0;
      
		int n =num1;
        do {
            sum1 = 0;
            while (n != 0) {
                int d = n % 10;
                sum1 += d * d;
                n /= 10;
            }
            n = sum1;
        } while (sum1 > 6);

        if (sum1 == 1) {
            System.out.println(num1 + " is a Happy Number");
        }
        else {
            System.out.println(num1 + " is not a Happy Number");
        }
	}

}

/*
Scanner in = new Scanner(System.in);
System.out.print("Enter number to check: ");
long num = in.nextLong();
long sum = 0;
long n = num;
do {
    sum = 0;
    while (n != 0) {
        int d = (int)(n % 10);
        sum += d * d;
        n /= 10;
    }
    n = sum;
} while (sum > 6);

if (sum == 1) {
    System.out.println(num + " is a Happy Number");
}
else {
    System.out.println(num + " is not a Happy Number");
}


*/