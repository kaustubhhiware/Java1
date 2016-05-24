import java.util.Scanner;

public class mclass2 {
	public static void main(String args[]){
		
		tun Tun = new tun();
		
		Scanner kh = new Scanner(System.in);
		
		System.out.println("Hey there!what's your name?");
		
		String name = kh.nextLine();
		
		Tun.mess(name);
		
	}
}
