package strings;

import java.util.Scanner;
public class letters {
	public static void main(String[]args)
	{
		 Scanner sc= new Scanner (System.in);
		 String s;
		 System.out.println("Enter Name :");
		 s=sc.nextLine();
		 
		 for (int i=0; i<="".length(); i++)
		 {
			 if (Character.isUpperCase(s.charAt(i)))
					 {
				 System.out.print(s.charAt(i)+".");
					 }
		 }
		 sc.close();
					 }
		 }
	


