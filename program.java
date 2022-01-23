package dee;
import java.util.Scanner;
public class program{
	public static void main(String[]args)
	{
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the num");
		num = sc.nextInt();
		
		switch(num%2)
		{
		case 0 :
			System.out.println(num+ " is a even num");
			break;
		
		case 1 :
			System.out.println(num +" is odd ");
			break;
	}
	}
}

