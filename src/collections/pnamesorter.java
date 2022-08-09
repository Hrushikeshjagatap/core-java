package collections;

import java.util.Comparator;

public class pnamesorter implements Comparator<product>
{

	@Override
	public int compare(product o1, product o2)
	{
		
		return o1.getName().compareTo(o2.getName());
	}

}
