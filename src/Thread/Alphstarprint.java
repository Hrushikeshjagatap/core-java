package Thread;

public class Alphstarprint implements Runnable
{
	public void printalph() throws InterruptedException
	{
		for(int i=65;i<91;i++)
		{
			System.out.println((char)i);
			Thread.sleep(1000);
		}
	}
	public void printstar()throws InterruptedException
	{
		for(int i=1;i<53;i++)
		{
			System.out.println("*");
			Thread.sleep(500);
		}
		
	}

	@Override
	public void run()
	{
		try {
			String s=Thread.currentThread().getName();
			if(s.equals("t1"))
			{
			
			printalph();
			}
			else if(s.equals("t2"))
			{
				 printstar();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
