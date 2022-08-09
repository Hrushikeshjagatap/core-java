package hrushikesh;

public class mall implements transction
{
	double amt;
	String date;
	public mall()
	{
		amt=0;
		date=null;
	}
	public mall(double a,String d)
	{
		amt=a;
		date=d;
	}
	@Override
	public void showtransction()
	{
		System.out.println("date="+date);
		System.out.println("amount="+getamount());
		
	}

	@Override
	public double getamount() 
	{
	
		return amt;
	}

}
