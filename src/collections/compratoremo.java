package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class compratoremo 
{

	public static void main(String[] args) 
	{
	ArrayList<product> plist=new ArrayList<product>();
	plist.add(new product(01, "tv1", 110000));
	plist.add(new product(02 ,"mix", 11000));
	plist.add(new product(99 ,"frize", 10000));
	plist.add(new product(00 ,"tv", 1100));
	
	System.out.println(plist);
	
	System.out.println("Menu\n 1)based on id \n based on id\n 2)based on name\n 3)based on price");
	System.out.println("enter your choice");
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
	switch (ch) {
	case 1:Collections.sort(plist,new pidsorter());
			System.out.println("Ater sorting based on id="+plist);
			break;
	case 2:Collections.sort(plist,new pnamesorter());
	System.out.println("Ater sorting based on name="+plist);
	break;
	case 3:Collections.sort(plist,new ppricesorter());
	System.out.println("Ater sorting based on price="+plist);

	
		break;

	default:System.out.println("Invalid choice");
		break;
	}
	}

}
