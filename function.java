package functionoverload;
import java.util.Scanner;
class area
{
	void rectangleArea()
	{
		System.out.println("area of rectangle is:");
	}
	float circleArea(float i)
	{
		System.out.print("enter the radius of circle:");
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextInt();
		float area = Math.abs(radius)*radius*3.14f;
		System.out.println("area of circle is:"+area);
		return area;
		
		
	}
	int squareArea(int l)
	{
		System.out.println("enter the side of square:");
		Scanner sc = new Scanner(System.in);
		int side;
		side=5;
		int area = side *side;
		System.out.println("area of square is: "+area);
		return area;
		
	}
		
	}

public class function {

	public static void main(String[] args) {
		area ob = new area();
		ob.rectangleArea();
		ob.circleArea(0);
		ob.squareArea(0);

	}

}
