package dee;
import java.util.*;

public class Hello{
	public static void main(String []args) {
		
		int age;
		String name;
		float fees;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your age");
		age = sc.nextInt();
		System.out.println("age is " +age);
		
		System.out.println("Enter your name");
		name= sc.next();
		System.out.println("your name is" +name);
		
		System.out.println("Enter your fees");
		fees = sc.nextFloat();
		System.out.println("Enter your fees");
		
		
	
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Fees = "+fees);
		
		
	}
	
}
