package collection;

import java.util.ArrayList;

public class empArrayList 
{
	public static void main(String args[])
	{
		ArrayList<emp> e=new ArrayList<emp>();
		e.add(new emp(1,"ABC",122000));
		e.add(new emp(2,"PQR",2000));
		e.add(new emp(3,"XYZ",20100));
		System.out.println("emp List is");
		System.out.println(e);
		e.remove(2);
		System.out.println("After remove,emp,list is");
		System.out.println(e);
	}

}
