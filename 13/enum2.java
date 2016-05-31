
public class enum2 {

	Kaustubh("CSE","Nagpur"),
	Raj("MF","Pune),
	Rahul("IE","Mumbai");
	
	private final String br;
	private final String pl;
	

	
	enum2(String khata,String jagah){
				br = khata;
				pl = jagah;
	}
	
	public String GetBr(){
		return br;
	}
	
	public String GetPl(){
		return pl;
	}
	
}
