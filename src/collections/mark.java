package collections;

import java.util.Comparator;

public class mark implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2) 
	{
		if(o1.getMark() > o2.getMark())
			return 1;
		else if(o1.getMark() < o2.getMark())
			return -1;
		else
		return 0;
	}

}
