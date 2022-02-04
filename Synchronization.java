package threading;
class Table{
	synchronized void print(int n, String g) {
		for (int  i=1;i<=10;i++) {
			System.out.println("n x" +i+"="+n*i);
		}
	}
}

class FirstThread extends Thread{
	Table t;
	public FirstThread(Table te) {
		this.t=te;
	}
	public void run() {
		t.print(5, "Hello");
	}
}
class SecondThread extends Thread{
	Table t;
	public SecondThread(Table te) {
		this.t=te;
	}
	public void run() {
		t.print(10,"Hii");
	}
}
public class Synchronization {
	public static void main(String[]args)
	{
		Table te= new Table();
		FirstThread t1=new FirstThread(te);
		SecondThread t2=new SecondThread(te);
		t1.start();
		t2.start();
	}

}
