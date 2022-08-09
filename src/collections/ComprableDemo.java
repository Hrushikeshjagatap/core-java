package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComprableDemo
{

	public static void main(String[] args)
	{
	ArrayList<book> blist=new ArrayList<book>();
	
	blist.add(new book(1, "let us c", "yk", 110));
	blist.add(new book(2, "jsjd", "dkhs",210));
	blist.add(new book(5, "let us c++", "yk", 110));
	blist.add(new book(3, "let us java", "yk", 110));
	blist.add(new book(4, "let", "yk", 10));
	System.out.println("Book List ");
	
	for (book b : blist)
	{
		System.out.println(b);
	}
	//sorting the comprable i.e. only one criteria
	Collections.sort(blist);
	System.out.println("after sorting book list is");

	for (book b: blist)
	{
	System.out.println(b);	
	}
	}

}
