package dee;
import java.util.Scanner;
public class grading {
	public static void main(String[]args)
	{
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the grade");
		grade=sc.next().charAt (0);
		
		
		if(grade=='A')
		{
			System.out.println("marks>=90 && marks<=100");
		}
		else if(grade=='B')
		{
			System.out.println("marks>=60 && marks<=89");
		}
		else if(grade=='C')
		{
			System.out.println("marks>=40 && marks<=59");
		}
		else if(grade=='D')

		{
			System.out.println("marks>=0 && marks<=39");
		}
		else
		{
			System.out.println("invalid");
		}
		}	
	}


