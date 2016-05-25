import java.util.Scanner;

public class method1 {
	public static void main(String args[]){
		Scanner kh = new Scanner(System.in);
		method2 me = new method2();
		System.out.println("Now,I need you to concentrate on the first name which comes to your mind when you think of pokemon ");
		
		String temp = kh.nextLine();
		me.setName(temp);
		me.say();
	}
}
