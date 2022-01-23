package strings;
import java.util.Scanner;
public class alphanumeric {
public static void main(String[]args)
{
	String test = "shjhg6554454ythgd";
	count(test);
}
public static void count(String x)
{
	char[] ch = x.tocharArray(0);
	int letter = 0;
	int num=0;
	int other = 0;
	for (int i=0; i<x.length(); i++)
{
if(Character.isLetter(ch[i]))
{
	letter++;
}
else if(Character.isDigit(ch[i]))
{
	num++;
}
else
{
	other ++;
}
}
System.out.println("The String is :shjhg6554454ythgd");
System.out.println("letter:"+letter);
System.out.println("number:"+num);


}
	}
	

	


