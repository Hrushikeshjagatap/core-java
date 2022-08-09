package collections;

import java.util.Comparator;

public class rnosorter implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2) 
	{
	if(o1.getRno() > o2.getRno())
		return 1;
	else if(o1.getRno() < o2.getRno())
		return -1;
	
		return 0;
	}

}
