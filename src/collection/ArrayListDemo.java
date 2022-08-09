package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{

	public static void main(String[] args)
	{
	ArrayList<Integer> nu=new ArrayList<Integer>();
	
	
	nu.add(10);
	nu.add(20);
	nu.add(30);
	System.out.println("by using toString method ");
	System.out.println(nu);

	
	Iterator<Integer> it=nu.iterator();
	System.out.println("by using Iterator ");
	while (it.hasNext())
	{
		Integer i = (Integer) it.next();
		
		System.out.println(i);
	}

	nu.remove(2);
	System.out.println("by using foreach loop ");
	for (Integer i1 : nu) {
		
		System.out.println(i1);
		
	}
	}

}
