
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class compartorDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	ArrayList<student> s=new ArrayList<student>();
	s.add(new student(1, "rushi", 100));
	s.add(new student(11, "ram", 35));
	s.add(new student(15, "sham", 80));
	s.add(new student(2,"gopal", 10));
	
	//System.out.println(s);

	for (student st : s)
	{
	System.out.println(st);	
	}
	String ans;
	
	
	do {
		System.out.println("Menu\n1)sorting based on roll no\n 2)sorting based on name\n 3)sorting based on mark");
		System.out.println("enter your choice");
		
		int ch=sc.nextInt();
		switch (ch) 
		{
					case 1:Collections.sort(s,new rnosorter());
							//System.out.println(s);
					for (student st : s)
					{
					System.out.println(st);	
					}
						break;
					case 2:Collections.sort(s,new snamesorter());
					//System.out.println(s);
					for (student st : s)
					{
					System.out.println(st);	
					}
					break;
					case 3:Collections.sort(s,new smark());
					//System.out.println(s);
					for (student st : s)
					{
					System.out.println(st);	
					}
					break;
		
					default:System.out.println("Invalid choice");
						break;
		}
		
		
		System.out.println("Do you want to repated this step (y/n)");
		sc.nextLine();
		ans=sc.nextLine();
	} 
	while (ans.equals("y")|| ans.equals("Y"));
	}

}
