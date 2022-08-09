package Thread;

public class SynchronizedmethodDemo 
{

	public static void main(String[] args)
	{
	Thread t1=new printtable();
t1.setName("t1");
Thread t2=new printtable();
t2.setName("t2");



t1.start();
t2.start();

	}

}
