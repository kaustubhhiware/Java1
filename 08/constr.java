
public class constr {
 
	private int month,day,year;
	
	public void worker(int m,int d,int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("the constructor for this is %s",this);
		
		}
	
	public String toString(){
	
		return String.format("%d/%d/%d\n",day,month,year);
	
	
	
	}
}
	
	
	



