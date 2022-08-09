package Thread;

public class ThreadDemo
{

	public static void main(String[] args)throws InterruptedException
	{
	Thread t1=new Demo("h","j");
	Thread t2=new Demo("s","ja");
	
	t1.setPriority(3);
	t2.setPriority(9);
	t1.start();
	//t1.join();
	t2.start();
	
	
	
	}

}
