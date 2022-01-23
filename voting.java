package dee;
import java.util.Scanner;

public class voting {
	public static void main(String[]args)
	{
		int age;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the num");
		age = sc.nextInt();
		
		if (age>=18)
		{
			System.out.println(age +" is eligible for voting");
		}
		if (age<18)
		{
			System.out.println(age +" is not eligible for voting");
		}
		
	}
	}


