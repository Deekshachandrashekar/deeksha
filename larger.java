package dee;
import java.util.Scanner;

public class larger {
	public static void main(String[]args)
	{
		int num1 , num2;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first number");
		num1 =sc.nextInt();
		
		System.out.print("enter the second number");
		num2 =sc.nextInt();
		
		if(num1 > num2)
		{
			System.out.println(num1+" is largest");
		}
		else if(num2 > num1)
		{
			System.out.println(num2+" is largest");
		}
		else
		{
			System.out.println("both are equal");
		}
	}
}
