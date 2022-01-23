package dee;
import java.util.Scanner;

public class electricbill {
	public static void main(String[]args)
	{
int unit;
float amount;
System.out.println("Enter your electricity units");
Scanner sc=new Scanner(System.in);
unit=sc.nextInt();
if(unit<100)
{
	amount=unit*0.8f;
}
else if(unit>=100 && unit<=300) {
	amount=100*0.8f+(unit-100)*1;
}
else
{
	amount=100*0.8f+200*1+(unit-300)*2.50f;
}
System.out.println("the amount you have to pay for units "+unit+" is " +amount);
}
}

