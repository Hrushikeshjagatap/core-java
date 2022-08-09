package exeption;

public class plzcheckmobnumber extends Exception
{
	String msg;
	public plzcheckmobnumber()
	{
		msg=null;
	}
	public plzcheckmobnumber(String m)
	{
		msg=m;
	}
	public String getmsg()
	{
		return msg;
	}
}
