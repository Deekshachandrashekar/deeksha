package dee;
import java.util.Scanner;

public class consonants {
public static void main(String[]args)
{
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a char to check it is voewl or not");
	ch = sc.next().charAt(0);
	
	switch(ch)
	{
	case 'a' : 
	case 'A' : 
	case 'e' : 
	case 'E' : 
	case 'i' : 
	case 'I' : 
	case 'o' : 
	case 'O' : 
	case 'u' : 
	case 'U' :
		System.out.println(ch+" is an vowel");
		break;
		default:
			System.out.println("Not an vowel");
	}
	
}
}
