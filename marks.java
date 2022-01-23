package dee;
import java.util.Scanner;
public class marks {
	public static void main(String[]args)
	{
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		marks=sc.nextInt();
		
		if(marks>=90 && marks<=100)
		{
			System.out.println("grade A");
		}
		else if(marks>=60 && marks<=89)
		{
			System.out.println("grade B");
		}
		else if(marks>=40 && marks<=59)
		{
			System.out.println("grade C");
		}
		else if(marks>=0 && marks<=39)
		{
			System.out.println("grade D");
		}
		else
		{
			System.out.println("invalid");
		}
		}	
	}


