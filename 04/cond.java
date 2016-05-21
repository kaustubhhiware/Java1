import java.util.Scanner;

public class cond {

	public static void main(String args[]){
	Scanner kh = new Scanner(System.in);
		int boy,girl;
		
	System.out.println("How many guys ?");
		boy=kh.nextInt();
	System.out.println("Did you bring any girls ?");
		girl=kh.nextInt();
		
		if(boy>18 && girl<70){
			System.out.println("You can enter");
		}else{
			System.out.println("Don't bother me again");
		}
	}
}
