package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class AWTDEMO1 extends Frame 
{
	TextField t1;
	Button b1;
	public AWTDEMO1(String title)
	{
		super(title);
		t1=new TextField(30);
		b1=new Button("ok");
		setLayout(new FlowLayout());
		add(t1);
		add(b1);
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		AWTDEMO1 a1=new AWTDEMO1("awt demo");

	}

}
