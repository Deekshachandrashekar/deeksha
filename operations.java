package dee;
import java.util.Scanner;
public class operations {
	public static void main(String[]args)
	{
		char operator;
		Double num1 , num2 , result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("choose an operator : + , - , * , /");
		operator = sc.next().charAt(0);
		
		System.out.println("Enetr first num");
		num1 = sc.nextDouble();
		
		System.out.println("Enetr second num");
		num2 = sc.nextDouble();
		
		switch (operator)
		{
		case '+' :
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
			break;
			
		case '-' :
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + result);
			break;
			
		case '*' :
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
			break;
			
		case '/' :
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
			break;
			
			default:
				System.out.println("Invalid operator!");
				break;
		}
		sc.close();
	}
}
		
