import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class clickDemo extends JFrame implements ActionListener
{
	JButton btn;
	Container cp;
	public clickDemo()
	{
		cp=getContentPane();
		
		btn=new JButton("click me");
		cp.add(btn);
		
		btn.addActionListener(this);
		
		//btn.removeActionListener(this);  you can remove ActionListener also by using remove methods
		cp.setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
	
		clickDemo c=new clickDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(this,"hello");  //frame /checkbox o/p dispaly
	//	System.out.println("helo");
	}

}
