import java.awt.Color;
import java.awt.Container;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class myscrollbar extends JFrame implements AdjustmentListener

{

	JScrollBar sred,sblue,sgreen,sorigin;
	Container cp;
	public myscrollbar(String title)
	{
		super(title);
		cp=getContentPane();
		cp.setLayout(null);
		
		sred=new JScrollBar();
		sred.setBackground(Color.red);
		sred.setBounds(50,50, 50, 300);
		cp.add(sred);
		sred.addAdjustmentListener(this);

		
		sblue=new JScrollBar();
		sblue.setBackground(Color.blue);
		sblue.setBounds(150,50, 50, 300);
		cp.add(sblue);
		sblue.addAdjustmentListener(this);
		
		sgreen=new JScrollBar();
		sgreen.setBackground(Color.green);
		sgreen.setBounds(250,50, 50, 300);
		cp.add(sgreen);
		sgreen.addAdjustmentListener(this);
		
		sorigin=new JScrollBar();
		sorigin.setBackground(Color.orange);
		sorigin.setBounds(350,50,50, 300);
		cp.add(sorigin);
		sorigin.addAdjustmentListener(this);

		setSize(600,600);
		setVisible(true);
		
	}

	
public static void main(String[] args) 
{
	myscrollbar my=new myscrollbar(" scroll bar ");
}


@Override
public void adjustmentValueChanged(AdjustmentEvent e) 
{
int r=sred.getValue();
int g=sgreen.getValue();
int b=sblue.getValue();
int o=sorigin.getValue();

Color c=new Color(r,g,b,o);
cp.setBackground(c);
}

}
