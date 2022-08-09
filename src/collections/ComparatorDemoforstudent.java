package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComparatorDemoforstudent
{

	public static void main(String[] args) 
	{
	List<student> slist=new ArrayList<student>();

	slist.add(new student(1, "Ram", 90));
	slist.add(new student(10, "sham", 88));
	slist.add(new student(7, "Gopal", 87));
	slist.add(new student(2, "gopal", 80));//string sorting on askii value
	
	System.out.println(slist);
	System.out.println("Menu\n 1)based on id \n based on id\n 2)based on name\n 3)based on price");
	System.out.println("enter your choice");
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
	switch (ch) {
	case 1:Collections.sort(slist,new rnosorter());
			System.out.println("Ater sorting based on id="+slist);
			break;
	case 2:Collections.sort(slist,new snamesorter());
	System.out.println("Ater sorting based on name="+slist);
	break;
	case 3:Collections.sort(slist,new mark());
	System.out.println("Ater sorting based on price="+slist);

	
		break;

	default:System.out.println("Invalid choice");
		break;
	}
}

}
