package threading;
class Book{
String title;
boolean isCompleted;

public Book(String title) {
	super();
	this.title = title;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public boolean isCompleted() {
	return isCompleted;
}
public void setCompleted(boolean isCompleted) {
	this.isCompleted = isCompleted;
}

}
class BookReader implements Runnable{
	Book book;
	
	public BookReader(Book book) {
		super();
		this.book = book;
	}
	public void run() {
		synchronized (book) {
			System.out.println(Thread.currentThread().getName()+" is waiting for book");
			
		}
	}
	
}
public class Booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

