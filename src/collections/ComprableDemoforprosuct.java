package collections;

import java.util.Collections;
import java.util.LinkedList;

public class ComprableDemoforprosuct
{

	public static void main(String[] args)
	{
	LinkedList<product> p=new LinkedList<>();
	p.add(new product(1, "jnd", 100.20));
	p.add(new product(12, "jnd", 400));
	p.add(new product(100, "jnd", 1500));
	p.add(new product(5, "jnd", 2000));
	p.add(new product(18, "jnd", 100.10));
	for (product b : p)
	{
		System.out.println(b);
	}
	//sorting the comprable i.e. only one criteria
	Collections.sort(p);
	System.out.println("after sorting book list is");

	for (product b: p)
	{
	System.out.println(b);	
	}

	
	}

}
