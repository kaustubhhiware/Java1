import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class event2 extends JFrame {

	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JPasswordField pass;
	
	public event2(){
		super("The title");
		setLayout(new FlowLayout());
		
		text1 = new JTextField(10);
		add(text1);
		
		text2 = new JTextField("Enter text here");
		add(text2);
		
		text3 = new JTextField("uneditable",20);
		text3.setEditable(false);
		add(text3);
		
		pass = new JPasswordField("my pass");
		add(pass);
		
		thehandler handler = new thehandler();
		text1.addActionListener(handler);
		text2.addActionListener(handler);
		text3.addActionListener(handler);
		pass.addActionListener(handler);

	}

	private class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
		
		String str = "";
		
		if(event.getSource() == text1)
			str = String.format("field 1 : %s", event.getActionCommand());
		else if(event.getSource() == text2)
			str = String.format("field 2 : %s", event.getActionCommand());
		if(event.getSource() == text3)
			str = String.format("field 3 : %s", event.getActionCommand());
		if(event.getSource() == pass)
			str = String.format("Password field is: %s", event.getActionCommand());

		JOptionPane.showMessageDialog(null,str);
		
	
		}
		
	}
}
	
