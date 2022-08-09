package Layout;
import java.awt.*;
import javax.swing.*;
/*
import java.awt.Container;
import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
*/
public class FlowLayoutDemo extends JFrame 
{
	JButton btn1,btn2;
	JTextField txt1;
	
	Container cp;
	
	
	public FlowLayoutDemo(String title)
	{	
	super(title);
	cp=getContentPane();
	
	cp.setLayout(new FlowLayout());
	
	btn1=new JButton("Click");
	btn2=new JButton("cancel");
	txt1=new JTextField(20);
	cp.add(txt1);
	cp.add(btn1);
	cp.add(btn2);
	
	
	setSize(400,400);
	setVisible(true);
	
	
	}

	

	public static void main(String[] args)
	{
	FlowLayoutDemo obj=new FlowLayoutDemo("FlowLayout");
	}

}
