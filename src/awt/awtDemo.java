package awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class awtDemo extends Frame
{
	awtDemo(String title)
	{
		super(title);
		setBackground(Color.red);
		setSize(400,400);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		//Font f=new Font("Arial",Font.BOLD,20);
		//g.setFont(f);
		//g.drawString("hello",50, 100);
		
	//1
		g.drawLine(73, 180, 73, 100);//body
		g.drawLine(40,160, 73, 115);//left hand
		g.drawLine(73,115,110,160);//right hand
		g.drawOval(50, 50, 50, 50);
		g.drawOval(60, 60, 5, 5);
		g.drawOval(82, 60, 5, 5);
	g.drawLine(50,190,73,170);
	g.drawLine(73,170,100,190);
	

	//2
	
	g.drawOval(130, 60, 50, 50);//doke
	g.drawLine(155,180,155,110);//body
	g.drawOval(140,70,5,5);//left eye
	g.drawOval(165, 70, 5,5);//right eye
	g.drawLine(110,160,155,125);//left hand
	g.drawLine(155,125,200,155);//right hand
	g.drawLine(155,180,90,125);//left leg
	
	
	
	
		
	}

	public static void main(String[] args)
	{
		
		awtDemo my=new awtDemo("awt demo");
	}

}
