package exeption;

public class student
{
	private int rno;
	private String name;
	private int mark;
	public student()
	{
		super();
		rno=mark=0;
		name=null;
	}
	public student(int r,String n,int m)
	{
		rno=r;
		name=n;
		mark=m;
	}
	public void givegrade() throws givegrade
	{
		if(mark<35)
		{
			throw new givegrade("low mark");
			
		}
		else
		{
			System.out.println("good mark");
		}
	}
	public String toString()
	{
		return "\n roll no="+rno+"\n name="+name+"\n mark="+mark;
	}
	
}
