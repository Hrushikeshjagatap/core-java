package collections;

import java.util.Comparator;

public class ppricesorter implements Comparator<product> 
{

	@Override
	public int compare(product o1, product o2) 
	{
	if(o1.getPrice() > o2.getPrice())
		return 1;
	else if(o1.getPrice() < o2.getPrice())
		return -1;
	else
		return 0;
	}

}
