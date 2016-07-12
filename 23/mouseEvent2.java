import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouseEvent2 extends JFrame{

	private JPanel mousepanel;
	private JLabel statusbar;
	
	public mouseEvent2(){
		
		super("The Title");
	//	setLayout(new FlowLayout());
		
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel,BorderLayout.CENTER);
		
		statusbar= new JLabel();
		add(statusbar,BorderLayout.SOUTH);
		
		Handler handler = new Handler();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);

	}
		
	private class Handler implements MouseListener,MouseMotionListener{	
		
		public void mouseClicked(MouseEvent event){
			statusbar.setText(String.format("Clicked at %d,%d",event.getX(),event.getY()));
		} 
		
		public void mousePressed(MouseEvent event){
			statusbar.setText("You pressed the mouse");
		} 
		
		public void mouseReleased(MouseEvent event){
			statusbar.setText("You released the button");
		} 

		public void mouseEntered(MouseEvent event){
			statusbar.setText("You entered the area");
			mousepanel.setBackground(Color.RED);
		} 
	
		public void mouseExited(MouseEvent event){
			statusbar.setText("The mouse left the window");
			mousepanel.setBackground(Color.GREEN);
		} 
	
	//These are mouse motion events
		
		public void mouseDragged(MouseEvent event){
			statusbar.setText("You are dragging the mouse");
		} 
		
		public void mouseMoved(MouseEvent event){
			statusbar.setText("You moved the mouse");
		} 
	
		
	}

}
