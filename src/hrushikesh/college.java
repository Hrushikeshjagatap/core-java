package hrushikesh;

public class college implements transction
{
String name,date;
double amount;
public college()
{
	name=date=null;
	amount=0;
}
public college(String n,String d,double a)
{
	name=n;
	date=d;
	amount=a;
}
	@Override
	public void showtransction() 
	{
		System.out.println("college name="+name);
		System.out.println("Date="+date);
		System.out.println("amount="+getamount());
		
	}

	@Override
	public double getamount()
	{
		
		return amount;
	}

}
