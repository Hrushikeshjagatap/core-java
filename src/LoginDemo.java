import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo extends JFrame implements ActionListener
{

	JLabel lblusername,lblpass;
	JTextField txtusername;
	JPasswordField txtpass;
	JButton btnlogin,btnreset;
	
	Container cp;
	public LoginDemo(String title)
	{
		super(title);
		cp=getContentPane();
		lblusername=new JLabel("user name");
		txtusername=new JTextField();
		
		lblpass=new JLabel("password");
		txtpass=new JPasswordField();
		
		btnlogin=new JButton("sumbit");
		btnreset=new JButton("cancel");
		
		cp.setLayout(new GridLayout(3,2));
		btnlogin.addActionListener(this);
		btnreset.addActionListener(this);
		
		cp.add(lblusername);
		cp.add(txtusername);
		cp.add(lblpass);
		cp.add(txtpass);
		cp.add(btnlogin);
		cp.add(btnreset);
		
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
	LoginDemo lo=new LoginDemo("Login Page");

	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	if (e.getSource()==btnlogin) 
	{
		
			if(txtusername.getText().equals("h") && txtpass.getText().equals("123"))
		{
			JOptionPane.showMessageDialog(this, "login succefully!!!.");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Login failed!");
		}
	
	}
	else if(e.getSource()==btnreset)
		{
		txtusername.setText("");
		txtpass.setText("");
		}
		
	}
}
