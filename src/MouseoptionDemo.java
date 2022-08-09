import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MouseoptionDemo extends JFrame implements MouseMotionListener
{
	
	JLabel lbl;
	JTextField txt;
	
	Container cp;
	
	public MouseoptionDemo(String title)
	{
		super(title);
		cp=getContentPane();
		lbl=new JLabel("co-ordinate are: ");
		txt=new JTextField(20);
		
		cp.setLayout(new FlowLayout());
		cp.add(lbl);
		cp.add(txt);
		
		
		cp.addMouseMotionListener(this);
		
		
		setSize(400,400);
		setVisible(true);
	
		
	}
	public static void main(String[] args) 
	{
		MouseoptionDemo m=new MouseoptionDemo("mouse Demo");

	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) 
	{
	int x=e.getX();
	int y=e.getY();
	txt.setText("("+x+","+y+")");
	}

}



