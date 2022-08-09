package Adpter;

import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public  class windowAdapterDemo extends Frame
{
	public windowAdapterDemo()
	{
		addWindowListener(new myclass(this));
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String args[])
	{
		windowAdapterDemo d=new windowAdapterDemo();
	}
	
	
}
class myclass extends WindowAdapter
{
	windowAdapterDemo da;
	public myclass(windowAdapterDemo d)
	{
		da=d;
	}
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		da.dispose();
	}
	
}
