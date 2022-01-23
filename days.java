package dee;

import java.util.Scanner;

public class days {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int days,seconds;
		System.out.println("Enter the days");
		days=scan.nextInt();
		System.out.println("convert days to seconds");
		int ans = days  *24*68*60;
		System.out.println(ans);
	}
	

}
