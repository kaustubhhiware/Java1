import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class checkbox2 extends JFrame{
	
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;

	
	public checkbox2(){
		super("The Title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("This is a plain sentence",20);
		tf.setFont(new Font("Serif",Font.PLAIN,14));
		add(tf);
		
		boldbox= new JCheckBox("bold");
		add(boldbox);
		italicbox= new JCheckBox("italic");
		add(italicbox);
		
		Handler handler = new Handler();
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
		
		
	}
	
	private class Handler implements ItemListener{
		
		public void itemStateChanged(ItemEvent event){
			
			Font font = null;
			
			
			if(boldbox.isSelected() && italicbox.isSelected())
				font = new Font("Serif",Font.BOLD+Font.ITALIC,14);
			else if(boldbox.isSelected())
				font = new Font("Serif",Font.BOLD,14);
		if(italicbox.isSelected())
				font = new Font("Serif",Font.ITALIC,14);
			else
				font = new Font("Serif",Font.PLAIN,14);
		
		tf.setFont(font);
		}
		
		
		
	}
	
	
	
}
