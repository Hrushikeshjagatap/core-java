package hrushikesh;
final class abc
{
	public void show()
	{
		System.out.println("hello...");
	}
}
//final class cannot be inherited
//final class cannot be base class
/*class xyz extends abc
{
	
}
*/
class Demo
{
	final int x;
	public Demo()
	{
		x=0;
	}
	public Demo(int v)
	{
	x=v;
	}
	public final void finalmethod()
	{
		System.out.println("final method");
	}
	
}
class another extends Demo
{
	//final method cannot be overriding
	/*public void finalmethod()
	{
		
	}
	*/
}
public class finalclassandmethodandfinalvariable 
{

	public static void main(String[] args)
	
	{
		Demo d1=new Demo(90);
		System.out.println(d1.x);
		//cannot change /update of final variable
		//d1.x=70;
	}

}
