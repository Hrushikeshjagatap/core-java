package exeption;
public class lowbalanceexception extends Exception 
{
	private String mymsg;
	
	public lowbalanceexception()
	{
	super();
	mymsg=null;
	}
	
	public lowbalanceexception(String s)
	{
		mymsg=s;
	}
	public String getmsg()
	{
		return mymsg;
	}
	
	
}
