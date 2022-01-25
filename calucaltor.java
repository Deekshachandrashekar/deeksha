package functionoverload;
class adder
{
	void add(int i,int j)
	{
		int add = i+j;
		System.out.println("addition is:"+add);
	}
	void add(float i,float j)
	{
		float add = i+j;
		System.out.println("addition is:" +add);
	}
	void add(double i,double j)
	{
		double add= i+j;
		System.out.println("addition is: "+add);
	}
}

public class calucaltor {
public static void main(String[]args)
{
	adder ob = new adder();
	ob.add(7, 8);
	ob.add(5.6f, 6.4f);
	ob.add(546, 745);
}
}
