package V36;

public class HeltalsSummering {

	public static void main(String[] args) {
		
		
		System.out.println(sum(10,20,20));
		
		
		
	}
	
	
	
	
	public static int sum(int... arr){
		
		int sum = 0;
		for (int a : arr) {
		
			sum += a;
			
			
		}
			
			
			
		return sum;
	}
	
	
	
}
