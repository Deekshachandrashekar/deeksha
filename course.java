package dee;
import java.util.Scanner;

public class course {
	public static void main(String[]args)
	{
		String cname;
		Scanner sc = new Scanner(System.in);
				System.out.println("***MENU***");
		System.out.println("Enter which course you want to jion");
		System.out.println("java");
		System.out.println("python");
		System.out.println("oracle");
		cname = sc.next();
		
		switch(cname)
		{
		case "java" :
					System.out.println("your course is java");
					break;
					
		case "python" :
			System.out.println("your course is python");
			break;
			
		case "oracle" :
			System.out.println("your course is oracle");
			break;
			
			default :
				System.out.println("Invalid choice");
				break;
}
}
}
	
