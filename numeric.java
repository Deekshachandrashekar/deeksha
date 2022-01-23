package strings;

public class numeric {
	public static void main(String []args)
	{
		String str = "12334555";
		boolean result = str.matches("[0-9]+");
		System.out.println("original string: "+ str);
		System.out.println("Does string contain only numbers ? :" + result);
	}

}
