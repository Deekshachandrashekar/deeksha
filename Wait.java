package threading;
class  Myclass1 extends Thread{
	int total;
	public void run() {
		synchronized(this) {
			
			for (int i=1;i<=50;i++) {
				total+=1;
				
			}
			notify();
			
		}
		
	}
}

public class Wait {

	public static void main(String[]args) throws InterruptedException {
		Myclass t=new Myclass();
		t.start();
		synchronized (t) {
		
		System.out.println("Waiting for total");
		t.wait();
		System.out.println("Total "+t.total);
		
		
	}
}
}
