package test;
import java.util.Scanner;

public class Uppercase  {
	   public static void main(String[] args) {
		     Scanner sc =new Scanner(System.in);
		     System.out.print("Enter String : "); 
		     String s = sc.nextLine();
		     String newstr = "";

		     String[] str = s.Split("\\s");

		    for (String string : str) {     
		      int length = string.Length();
		      String firstchar = string.Substring(0, 1);
		      String restchar = string.Substring(1, length - 1);
		      String lastchar = Character.toString(string.charAt(length - 1));
		      newstr = newstr+firstchar.toUpperCase()+restchar+" ";
		    } 
		    System.out.println(newstr); 
		  }
}
