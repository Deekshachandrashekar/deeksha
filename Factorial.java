package looping;

public class Factorial {
	public static void main(String[]args) 
	{
		int n;
		n=50;
		long factorial=1;
		for(int i = 1; i <= n; i++)
		{
			factorial *= i;
		}
		System.out.printf("factorial of %d = %d", n , factorial);
		
		}
}
