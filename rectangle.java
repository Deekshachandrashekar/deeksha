package dee;
import java.util.Scanner;
public class rectangle {
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle:");
		double l= sc.nextDouble();
		
		System.out.println("Enter the breadth of the triangle:");
		double b= sc.nextDouble();
		
		double area = (l*b);
		System.out.println("Area of rectangle is: " + area);
	}
	

}



