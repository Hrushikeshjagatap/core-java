package Thread;

public class AccountUser implements Runnable
{


	Account ac;
	String operation;
	
	
	public AccountUser(Account ac, String operation) 
	{
		super();
		this.ac = ac;
		this.operation = operation;
	}


	@Override
	public void run() 
	{
		synchronized(ac)
		{
				
			try {
					if(Thread.currentThread().getName().equals("User1"))
					{
					
					ac.deposite();
					Thread.sleep(1000);
					
					}
					else if(Thread.currentThread().getName().equals("User2"))
					{
						ac.withdraw();
						Thread.sleep(1000);
						
					}
				} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
		
	}
	

}
