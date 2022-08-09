package collection;

import java.util.Stack;

public class stackDemo
{

	public static void main(String[] args) 
	{
	Stack<String> nm=new Stack<String>();
	nm.push("rushi");
	nm.push("paatil");
	nm.push("jagatap");
	nm.push("vaibhav");
	
	System.out.println("name List are ="+nm);
	System.out.println("fisrt element in stack\t"+(nm.firstElement()));
	System.out.println("peek/last element in stack\t"+(nm.peek()));
	System.out.println("removed element is\t"+nm.pop());
	System.out.println("peek/last element in stack\t"+(nm.peek()));
	System.out.println("name List are ="+nm);
	//System.out.println(nm.capacity());
	
	}

}
