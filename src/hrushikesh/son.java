package hrushikesh;

public class son implements father,uncle
{

	public static void main(String[] args)
	{
		father f=new son();
		f.totalproperty();

	}
	static int amt=700,tamt;
	public static void statement()
	{
		System.out.println(amt);
	}
	
	@Override
	public void totalproperty()
	{
	tamt=amt+amt1+amt2;
	System.out.println(tamt);
		
	}

}
