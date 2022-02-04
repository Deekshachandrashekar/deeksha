package threading;

	class Myclass extends Thread{
		int total;
		public void run() {
			synchronized (this) {
				
			for(int i=1;i<=50;i++) {
				total+=i;
				
				
			}
			notify();
			
		}
	}
	}

	public class Notify {

		public static void main(String[] args) throws InterruptedException {
			Myclass t=new Myclass();
			t.start();
			synchronized (t) {
				
				 System.out.println("Waiting for Total");
			          t.wait();
			          System.out.println("Total "+t.total);
			     }
	    }
	}



