package Layout;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame
{
	JButton btns,btnn,btne,btnw,btnc;
	
	Container cp;
	
	public BorderLayoutDemo(String Title)
	{
		super(Title);
		
		cp=getContentPane();
		//default layout is Border Layoyt
		
		btns=new JButton("south");
		btnn=new JButton("north");
		btne=new JButton("east");
		btnw=new JButton("west");
		btnc=new JButton("Center");
		
		cp.add(btnc);// by default is center
		cp.add(btne,"East");
		cp.add(btnn,"North");
		cp.add(btns,"South");
		cp.add(btnw,"West");
		
		setSize(400,400);
		setVisible(true);
	
	}
	public static void main(String[] args)
	{
	BorderLayoutDemo obj=new BorderLayoutDemo("Border Layout");

	}

}
