package collections;

import java.util.Comparator;

public class pidsorter implements Comparator<product>
{

	@Override
	public int compare(product o1, product o2)
	{
	if(o1.getId() > o2.getId())
		return 1;
	else if(o1.getId() < o2.getId())
		return -1;
	else
		return 0;
	}

}
