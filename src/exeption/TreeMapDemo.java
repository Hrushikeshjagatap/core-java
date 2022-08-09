package exeption;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> st=new TreeMap<>();
		st.put(1, null);
		st.put(45, "sonali");
		st.put(2, "amit");
		st.put(7,"henna");
		st.put(2, "aubash");
		
		
		System.out.println(st);
		for(Map.Entry<Integer, String> s:st.entrySet())
		{
			System.out.println(s.getKey()+"\t"+s.getValue());
		}
	}

}
