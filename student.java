package dee;

import java.util.Scanner;

public class student {
public static void main(String[]args)
{
	
	String name;
	float marks;
	Scanner sc = new Scanner (System.in);
	
	
	System.out.println("Enter your name");
	name= sc.next();
	System.out.println("your name is " +name);
	
	System.out.println("Enter your marks");
	marks = sc.nextFloat();
	System.out.println("Enter your marks");
	

	System.out.println("Name = "+name);
	System.out.println("marks = "+marks);
	System.out.println("avg = "+marks/5);
	

}
}

	
	

