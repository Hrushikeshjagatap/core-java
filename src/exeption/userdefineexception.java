package exeption;

public class userdefineexception
{

	public static void main(String[] args) 
	{
	Account ac=new Account(1,999);
	System.out.println(ac);
	try
	{
		ac.withdraw();
	}
	catch(lowbalanceexception e)
	{
	System.out.println("mymsg="+e.getmsg());
	e.printStackTrace();

	}
	catch(Exception e)
	{
		//e.printStackTrace();
	}
	}

}
