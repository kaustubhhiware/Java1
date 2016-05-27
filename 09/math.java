import java.util.Random;

public class math {

	public static void main(String args[]){
		
		System.out.println("floor(7.8) = "+Math.floor( 7.8));
		System.out.println("abs(-7.8) = "+Math.abs(-7.8));
		System.out.println("ceil( 7.8) = "+Math.ceil( 7.8));
		System.out.println("max( 6,7.8) = "+Math.max( 6,7.8));
		System.out.println("min( 6,7.8) = "+Math.min( 6,7.8));
		
		Random dice = new Random();
		int no,count;
		
		System.out.println("+++ Generating 9 arbit octagon dice tosses... ");
		for(count=1;count<10;count++){
			no = dice.nextInt(8);
			System.out.println(no+"  ");
		}
	}
}
