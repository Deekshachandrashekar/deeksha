package functionoverload;

class addition
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
	void add(short i, short j)
	{
		short add = (short) (i+j);
		System.out.println("addition is:"+add);
	}
	void add(byte i, byte j)	
	{
		byte add = (byte)(i+j);
		System.out.println("addition is:"+add);
	}
	}


public class calcii {

	public static void main(String[] args)
	{
		
			addition ob = new addition();
			ob.add(7, 8);
			ob.add(5.6f, 6.4f);
			ob.add(546, 745);
			ob.add(786, 786);
			ob.add(56, 86);
		}
		}


