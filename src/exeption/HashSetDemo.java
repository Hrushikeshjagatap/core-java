package exeption;

import java.util.HashSet;

public class HashSetDemo 
{

	public static void main(String[] args)
	{
	HashSet<String> hs=new HashSet<>();
	hs.add("amit");
	hs.add("bala");		//same aale ki replace hote
	hs.add("sharma");
	hs.add("amit");
	hs.add("vanna");
	hs.add(null);
	System.out.println("hash set="+hs);
	
	hs.remove("amit");
	System.out.println("after removal="+hs);
	hs.remove(null);
	System.out.println(hs);
	}

}
