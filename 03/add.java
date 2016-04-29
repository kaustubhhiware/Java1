import java.util.Scanner;


public class add {
	public static void main(String args[]){
		Scanner kh = new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter first number");
		a = kh.nextDouble();
		System.out.println("Enter second number");
		b = kh.nextDouble();
		
		c = a+ b;
		System.out.print("The sum is ");
		System.out.println(c);
	}
}
