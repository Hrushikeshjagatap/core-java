package Thread;

public class Demo extends Thread
{
	private String fname,lname;
	public Demo()
	{
		fname=null;
		lname=null;
	}
	
	public Demo(String fn,String ln)
	{
		fname=fn;
		lname=ln;
	}
	public void run()
	{
		try
		{
			System.out.println("Current Thread="+Thread.currentThread());
			System.out.println("Fname="+fname);
			Thread.sleep(1000);
			System.out.println("Lname="+lname);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
