
public class time1 {
	public static void main(String args[])
	{
		time2 tim = new time2();
		System.out.println(tim.tomil());
		
		tim.SetTime(24,27,54);
		System.out.println(tim.tomil());
		System.out.println(tim.tostd());
		
		System.out.println("without THIS");
		
		tim.SetTime1(24,27,54);
		System.out.println(tim.tomil());
		System.out.println(tim.tostd());
		
System.out.println("with THIS");
		
		tim.SetTime2(24,27,54);
		System.out.println(tim.tomil());
		System.out.println(tim.tostd());
		
		
	}
}
