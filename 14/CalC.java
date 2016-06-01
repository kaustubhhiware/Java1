import javax.swing.JOptionPane;

public class CalC {

	public static void main(String args[]){
		
		int opt_out=0;
		String opt;
		int num =0;
	
		String opn = JOptionPane.showInputDialog("Enter operation to be performed");
		/*while(opn!="+"||opn!="-"||opn!="*"||opn!="/")
		{
			opn = 	JOptionPane.showInputDialog(null,"Enter Correct Operation",JOptionPane.PLAIN_MESSAGE);
			if(opn=="+"){break;}
			else if(opn=="-"){break;}
			else if(opn=="*"){break;}
			else if(opn=="/"){break;}
		}*/

		while(num == 0&&opt_out==0){

		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");
		
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);


		switch(opn){
		case "+" : 
			int sum = num1+num2;
			JOptionPane.showMessageDialog(null,"The answer is "+sum,"Addition",JOptionPane.PLAIN_MESSAGE);
			num++;
			break;
			
		case "-" : 
			int diff = num1-num2;
			JOptionPane.showMessageDialog(null,"The answer is "+diff,"Substraction",JOptionPane.PLAIN_MESSAGE);
			num++;
			break;
			
		case "*" : 
			int mul = num1*num2;
			JOptionPane.showMessageDialog(null,"The answer is "+mul,"Multiplication",JOptionPane.PLAIN_MESSAGE);
			num++;
			break;
		
		case "/" : 
			int div = num1/num2;
			JOptionPane.showMessageDialog(null,"The answer is "+div, "Division",JOptionPane.PLAIN_MESSAGE);
			num++;
			break;
		
		default :
			opn = 	JOptionPane.showInputDialog(null,"Enter Correct Operation",JOptionPane.PLAIN_MESSAGE);
			//System.out.println("Enter correct input");
			num = 0;
			
			}
		num=0;
			opt = 	JOptionPane.showInputDialog(null,"Enter 1 if you want to exit else 0 to continue",JOptionPane.PLAIN_MESSAGE);	
			opt_out = Integer.parseInt(opt);
			if(opt_out==0)
			{
						 opn = JOptionPane.showInputDialog("Enter operation to be performed");
			}
		}
		
	}
	}	

