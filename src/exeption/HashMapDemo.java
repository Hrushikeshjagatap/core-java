package exeption;

/*import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
*/
import java.awt.*;
import java.util.*;

public class HashMapDemo 
{

	public static void main(String[] args)
	{
	HashMap<Integer,String> st=new HashMap<Integer,String>();
	
	
	st.put(10, "amit");
	st.put(100, null);
	st.put(5," ball");
	st.put(null, null);
	st.put(3, null);
	st.put(null, null);
	st.put(3, "hbashds");
	
	//toString method
	System.out.println(st);
	//foreachLoop
	
	for(Map.Entry<Integer, String> m:st.entrySet())
	{
		System.out.println(m.getKey()+"\t"+m.getValue());
	}
	
	
	}

}
