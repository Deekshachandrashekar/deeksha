package dee;
import java.util.Scanner;

public class switchday {
	public static void main(String[]args)
	{
		int day;
		Scanner sc = new Scanner(System.in) {
			day = sc.nextInt("enter the day number");
			switch(day)
			{
			case 1 :
				System.out.println("Monday");
				break;
				
			case 2 :
				System.out.println("Tuesday");
				break;
				
			case 3 :
				System.out.println("Wednesday");
				break;
				
			case 4 :
				System.out.println("Thursday");
				break;
				
			case 5 :
				System.out.println("Friday");
				break;
				
			case 6 :
				System.out.println("Saturday");
				break;
				
			case 7 :
				System.out.println("MondaSunday");
				break;
				
			case 8 :
				System.out.println("Invalid input");
				break;
				
				
				
				
			}
		}
	}

}
