package dee;
import java.util.Scanner;

public class condition {
public static void main(String[]args)
{
	int num;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the num");
	num = sc.nextInt();
	
	if (num>0)
	{
		System.out.println(num +" is positive");
	}
	if (num<0)
	{
		System.out.println(num +" is negative");
	}
	if (num==0)
	{
		System.out.println(num +" is neutral");
	}
}
}
