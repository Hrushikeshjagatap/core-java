package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue 
{

	public static void main(String[] args) 
	{
		//1) string
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("bala");
		q.add("sharma");
		q.add("amit");
		q.add("vanna");
		q.add("amit");
		q.add(null);
		Iterator<String> it=q.iterator();
		System.out.println("Queue for String");
		while (it.hasNext()) 
		{
			String s1 = (String) it.next();
			System.out.println(s1);
			
		}
		//2) Integer
		PriorityQueue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(11);
		q1.add(22);
		q1.add(11);
		q1.add(55);
		q1.add(55);
		
		Iterator<Integer> it1=q1.iterator();
		System.out.println("Queue for Intger");
		while (it1.hasNext()) 
		{
			Integer s1 = (Integer) it1.next();
			System.out.println(s1);
			
		}
		
	}
	

}
