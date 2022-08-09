package Layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class colorchossingDemoudingFlowLayout extends JFrame implements ActionListener
{
	JButton btn1;
	
	Container cp;
	
	public colorchossingDemoudingFlowLayout(String title)
	{
		super(title);
		
		cp=getContentPane();
		
		btn1=new JButton("click me");
		
		
		btn1.addActionListener(this);
		
		cp.setLayout(new FlowLayout());
		
		cp.add(btn1);
		
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
	colorchossingDemoudingFlowLayout obj=new colorchossingDemoudingFlowLayout("color choosing");

	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
	JColorChooser js=new JColorChooser();//color chooser object
	
	Color c=js.showDialog(this,"select color",Color.red);//show color in dialog box
	cp.setBackground(c);//set select color to background
	}

}
