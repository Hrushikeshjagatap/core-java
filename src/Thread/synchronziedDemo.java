package Thread;

public class synchronziedDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
	Account ac=new Account(100,5000);
	System.out.println("Account is="+ac);
	
	Runnable r1=new AccountUser(ac,"deposite");
	Runnable r2=new AccountUser(ac,"withdraw");
	
	Thread t1=new Thread(r1,"User1");
	Thread t2=new Thread(r2, "User2");
	
	t1.start();
	
	
	t2.start();
	
	t1.join();
	t2.join();
	
	
	
	}

}
