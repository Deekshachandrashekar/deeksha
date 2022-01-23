package test;
import java.util.*;
import java.io.*;

public class tribonacci {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number till u want tribonacci series:");
	int n = sc.nextInt();
	
	int a = 0, b = 0, c = 1;
	int d = a+b+c;
	
	System.out.println("\nTribonacci series:");
	System.out.print(a+"\t"+b+"\t"+c);
	
	for (int i=4;i<n;i++)
	{
		System.out.println("\t"+d);
		a=b;
		b=c;
		c=d;
		d=a+b+c;
	}
	System.out.println();
	
	}
}
