package exeption;

public class userdefineexceptionofstudent 
{

	public static void main(String[] args) 
	{
	student st=new student(1,"ram",25);
	System.out.println(st);
	try
	{
		st.givegrade();
	}
	catch(givegrade e)
	{
		System.out.println("mymsg="+e.getmsg());
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	}

}
