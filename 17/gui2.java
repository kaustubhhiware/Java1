import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class gui2 extends JFrame{
	
	private JButton reg;
	private JButton custom;
	
	public gui2(){
		super("The Title");
		setLayout(new FlowLayout());
		
		reg = new JButton("reg Button");
		add(reg);
		
		Icon a = new ImageIcon(getClass().getResource("f.png"));
		Icon k = new ImageIcon(getClass().getResource("t.png"));
		custom = new JButton("custom Button",a);
		custom.setRolloverIcon(k);
		add(custom);
		
		Handler handler = new Handler();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		}
		
		private class Handler implements ActionListener{
	
			public void actionPerformed(ActionEvent event){
		
				JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
		
		
			}
	
		}

}
