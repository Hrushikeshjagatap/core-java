package Layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame
{
	Container cp;
	
	public GridLayoutDemo(String title)
	{
		super(title);
		cp=getContentPane();
		
		cp.setLayout(new GridLayout(3,2,10,10));//(rows,cloumns,  ,)
		
		//anonoymas ref/obj.
		
		cp.add(new JButton("1"));
		cp.add(new JButton("2"));
		cp.add(new JButton("3"));
		cp.add(new JButton("4"));
		cp.add(new JButton("5"));
		
		setSize(400,400);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) 
	{

		GridLayoutDemo obj=new GridLayoutDemo("Grid Layout ");
	}

}
