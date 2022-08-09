package hrushikesh;

public class StrungufferDemo
{

	public static void main(String[] args)
	{
	StringBuffer br=new StringBuffer("abc");
	//	String br="hrushikesh";
	   System.out.println(br);
	   System.out.println("hash code="+br.hashCode());
	   String s="hii";
	   br.append(s);
	   System.out.println(br);
	   System.out.println("hash code="+br.hashCode());
	   
	   
	}

}
