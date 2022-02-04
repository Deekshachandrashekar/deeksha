package arrays;
import java.util.Scanner;

public class program {
	public static void main(String []args)
	{
		int a[] [] = new int [4][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  4*3 matrix");
		
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<3;j++)
			{
					System.out.print(a[i][j]);
			}
		}
	}
}
		
	


