package exeption;

public class divDemo
{
	public void method()
	{
		int a[]=new int[5];
		a[11]=1;
	}
	public static void main(String[] args) 
	{
	divDemo d1=new divDemo();
	int n=4,d=0,div;
	try
	{
	div=n/d;
	System.out.println("div="+div);
	
	}
	catch(ArithmeticException e)
	{
	System.out.println(e.getMessage());
	e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("i am always exectue");
	}
	}
	

}
