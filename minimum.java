package dee;

public class minimum {
	public static void main(String [] args)
	{
		int a = 30;
		int b = 24;
		int c = 56;
		
		int smallest = (a<b)?(a<c?a:c):(b<c?b:c);
		 
		System.out.println(smallest + " is the smallest.");
	}

}
