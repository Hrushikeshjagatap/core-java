

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;

import javax.swing.*;
//import javax.swing.JRadioButton;

public class backgroundchange extends JFrame implements ItemListener
{

		JRadioButton rbtnred,rbtnblue;
		Container cp;
		public backgroundchange(String title)
		{
			super(title);
			cp=getContentPane();
			rbtnred=new  JRadioButton("red");
			rbtnblue=new JRadioButton("blue");
			
			
			rbtnred.addItemListener(this);
			rbtnblue.addItemListener(this);
			
			ButtonGroup g=new ButtonGroup();
			g.add(rbtnred);
			g.add(rbtnblue);
			
			cp.setLayout(new FlowLayout());
			
					
			
			cp.add(rbtnred);
			cp.add(rbtnblue);
			cp.setBackground(Color.pink);
			setSize(400,400);
			setVisible(true);
		}
	
public static void main(String[] args)
{
	backgroundchange obj=new backgroundchange("back ground color");
}

@Override
public void itemStateChanged(ItemEvent e)
{
if(e.getSource()==rbtnred)
{
	cp.setBackground(Color.red);
}
else if(e.getSource()==rbtnblue)
{
	cp.setBackground(Color.blue);}
	
}
}
