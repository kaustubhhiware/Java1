import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MSlist2 extends JFrame{


	private JList leftlist;
	private JList rightlist;
	private JButton button;
	private static String[] foods = {"dhokla","khandwa","fafda","jilebi","chiwda","more"};
	//#hamare gujarat main aisa hi hota hai
	public MSlist2(){

		super("The title");
		setLayout(new FlowLayout());

		leftlist = new JList(foods);
		leftlist.setVisibleRowCount(7);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));

		button = new JButton("MOVE----->");
		button.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						extracted();
					}

					private void extracted() {
						rightlist.setListData(leftlist.getSelectedValues());
					}
				}
			);
		add(button);

		rightlist = new JList();
		rightlist.setVisibleRowCount(7);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		add(new JScrollPane(rightlist));

	}

}
