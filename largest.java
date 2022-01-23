package dee;
import java .util.Scanner;
public class largest {
	public static void main(String[] args)
	{
		int a , b , big;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two numbers:");
		a = scan.nextInt();
		b = scan.nextInt();
		
		big = (a>b) ? a: b;
		System.out.println("\nLargest = " +big);
	}

}
