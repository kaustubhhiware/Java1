import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class list2 extends JFrame{
	
	private JList list;
	private static String[] colornames = {"black","blue","red","white"};
	private static Color[] color = {Color.BLACK,Color.BLUE,Color.RED,Color.WHITE};
	
	public list2(){
		
		super("The title");
		setLayout(new FlowLayout());
		
		list = new JList(colornames);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		
		list.addListSelectionListener(
				
				new ListSelectionListener(){
				
					public void valueChanged(ListSelectionEvent event) {
						 getContentPane().setBackground(color[list.getSelectedIndex()]);
						
					}
				}
			);
	}
}

