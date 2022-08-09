package hrushikesh;

public class mainofinterface
{

	public static void main(String[] args) 
	{
	transction s[]=new transction[2];
	s[0]=new mall(100,"1-jan-2022");
	s[1]=new college("vp","1-dec-2021",1200);
	for (transction t1 : s)
	{
		System.out.println(t1);
		t1.getClass();	
		t1.showtransction();
	}
	
	}

}
