package collection;

import java.util.LinkedList;

public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(11);
		list.add(20);
		list.add(20);
		list.add(0, null);
		
		list.addFirst(2);
		list.addFirst(12);
	
		list.addLast(10);
		list.addLast(100);
		
		System.out.println("Linkes List Element is"+list);
		list.remove(1);
		System.out.println("Linked List after remove the element is");
		System.out.println(list);
		list.clone();//copy of list linked element
		System.out.println("Linkes List Element is after clone"+list);
		
	}

}
