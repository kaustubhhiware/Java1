
public class variable_length {

	public static void main(String args[]){
			
		System.out.println(average(2,43,6,33,56,32));
		
	}
	
	public static int average (int ...numbers){
		int total=0;
		for(int x : numbers){
			total+=x;
		}
		
		return total/numbers.length;
	}
	
	
	
	
	
	
	
	
}
