import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouseAdapter2 extends JFrame{

	private JLabel statusbar;
	private String details;
	
public mouseAdapter2(){
	
	super("The Title");
	
	statusbar = new JLabel("This is default");
	add(statusbar,BorderLayout.NORTH);
	addMouseListener(new MouseClass());
}
	private class MouseClass extends MouseAdapter{
		
		public void mouseClicked(MouseEvent event)
		{
			
			details = String.format("You clicked %d times ", event.getClickCount());
			
			if(event.isMetaDown())
				details += "with rigthmouse button";
			else if(event.isAltDown())
				details += "with center mouse button";
			else
				details += "with left mouse button";
			
			statusbar.setText(details);
		}
	}
}

