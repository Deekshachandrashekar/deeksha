package dee;
import java.util.Scanner;

public class large {
	public static void main(String[]args)
	{
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the first number");
		num1 =sc.nextInt();
		
		System.out.print("enter the second number");
		num2 =sc.nextInt();
		
		System.out.print("enter the third number");
		num3 =sc.nextInt();
		
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1+" is largest");
		}
		else if(num2 > num3)
		{
			System.out.println(num2+" is largest");
		}
		else
		{
			System.out.println("num3 is largest");
		}
		
		
		}
			
		}
	
