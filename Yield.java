package threading;

public class Yield extends Thread  
{  
    public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + "run in control");  
    }  
    public static void main(String[]args)  
    {  
    	Yield t1 = new Yield();  
    	Yield t2 = new Yield();  
        // this will call run() method  
        t1.start();  //runnable 
        t2.start();  //runnable
        for (int i=0; i<3; i++)  
        {  
            // Control passes to child thread  
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " Main in control");  
        }  
    }  
}



