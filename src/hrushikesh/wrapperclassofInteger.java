package hrushikesh;

public class wrapperclassofInteger
{

	public static void main(String[] args)
	{
		//int a=15;
		Integer aobj=new Integer(10);
		System.out.println("max="+Integer.MAX_VALUE);
		System.out.println("min="+Integer.MIN_VALUE);
		System.out.println("aoj="+aobj);
		//convert into binary number
		System.out.println("binary="+Integer.toBinaryString(aobj));
		//convert into octal number
		System.out.println("octal="+Integer.toOctalString(aobj));
		//convert into hex 
		System.out.println("hex="+Integer.toHexString(aobj));
	}

}
