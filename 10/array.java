
public class array {

	public static void main(String args[]){
		int arr[] = new int[3];
		
	arr[0]=12;
	arr[1]=23;
	arr[2]=34;
	System.out.println(arr[1]);
	System.out.println(arr.length);
	int total=0;
	for(int x : arr){
		total+=x;
	}
	
	System.out.println("the total is "+total);
		change(arr); 
	for(int y : arr){
		System.out.print(y + "\t");
	}
	
	
	}
	
	public static void change(int x[]){
		for(int count=0;count<x.length;count++)
			x[count]+=5;
	}
	
	
}
