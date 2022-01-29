import java.util.Scanner;
public class Stringdtswitch {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("******MENU****");
		System.out.println("Java");
		System.out.println("Python");
		System.out.println("C++");
		System.out.println("C");
		System.out.println("Ruby");
		System.out.println("Enter your choice");
		String str=sc.nextLine();
		switch(str)
		{
			case "Java":
				System.out.println("my couse is in java");
				break;
			case "Python":
				System.out.println("My course is in python");
				break;
			case "C++":
				System.out.println("My course is in C++");
				break;
			case "C":
				System.out.println("My course is in C");
				break;
			case "Ruby":
				System.out.println("My course is in ruby");
				break;
				default:
					System.out.println("Invalid course name");
		}
		

	}

}
