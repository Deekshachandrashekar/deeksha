package test;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) 
		{
			 int i,j,count=0;
	        
	         System.out.println("prime number between 50 to 100\n");
	         
	        
	         for(i=2;i<=100;i++)
	         {
	            for(j=1;j<=i;j++)
	            {
	              if(i%j==0)
	                count++;
	            }
	            if(count==2)
	              System.out.print(" "+i);
	            count=0;
	          }
	}
	}
