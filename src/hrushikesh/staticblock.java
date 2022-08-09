package hrushikesh;

public class staticblock 
{

	public static void main(String[] args)
	{
		System.out.println("main() is called");
	}
	//before main method static method called 
	static 
	{
	System.out.println("In static block");	
	}

}
