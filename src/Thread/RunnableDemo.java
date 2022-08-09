package Thread;

public class RunnableDemo {

	public static void main(String[] args)
	{
		Runnable r1=new Alphstarprint();
		Runnable r2=new Alphstarprint();
		
		
		Thread t1=new Thread(r1,"t1");
		Thread t2=new Thread(r2,"t2");
		
		t1.start();
		t2.start();
		
	}

}
