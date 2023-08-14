package package3;

public class MyMath1 {
	private int num1, num2;
	
	public MyMath1() {
		
	}
	
	public  MyMath1(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int allsum() {
		int sum = 0;
		for(  ; num1<=num2; num1++) {
			sum+=num1;
		}
		return sum;
	}
	
	public int allsum(int num1,int num2) {
		int sum = 0;
		for(  ; num1<=num2; num1++) {
			sum+=num1;
		}
		return sum;
	}
}
