package Thread;

import java.util.Iterator;

public class printtable extends Thread
{
	public synchronized static void print(int n) throws InterruptedException
	{
		System.out.println("\n Current is="+Thread.currentThread());
		
		for(int i=1;i<11;i++)
		{
			System.out.println(n*i+"\t");
			Thread.sleep(1000);
			
			
		}
	}
	public void run()
	{
		String s=Thread.currentThread().getName();
		try {
				if(s.equals("t1"))
				{
				
					printtable.print(5);
				}
				else if(s.equals("t2"))
				{
					printtable.print(4);
				}
			}	
			catch (InterruptedException e)
		{
		e.printStackTrace();
			
			
		}
	}
}
