
public class time2 {

	private int hour,minute,second;
	
	public void SetTime(int h,int m,int s){
		
		hour =  ((h>=0 && h<24) ?  h : 0);
		minute = ((m>=0 && m<60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);
		
	}

	public void SetTime1(int hour,int minute , int second){
		
		hour =  7;
		minute = 8;
		second = 9;
		
	}
	
public void SetTime2(int h,int m,int s){
		
		this.hour =  4;
		this.minute = 5;
		this.second = 6;
		
	}
		public String tomil(){
			return String.format("%02d:%02d:%02d",hour,minute,second);
		}	
		public String tostd(){
			return String.format("%d:%02d:%02d %s",(( hour==0 || hour==12) ? 12 : hour%12),minute,second,((hour<12) ? "AM": "PM"));
			
		}	
}
