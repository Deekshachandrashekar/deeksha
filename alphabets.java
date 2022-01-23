package strings;

public class alphabets {
	public static void main(String []args)
	{
		String str = "abchgAFRC";
		boolean result = str.matches("[a-zA-Z]+");
		System.out.println("original string : " +str);
		System.out.println("does string contain only alphabets? : "+ result);
	}
	}


