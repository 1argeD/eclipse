package 이정도는풀수있어야;

public class MyCalc {
	int a,b,c;
	
	public MyCalc(int a,int b,int c) {
		this.a = a;
		this.b = b; 
		this.c = c;
	}
	
	public MyCalc() {
		
	}
	public  int add(int n) {
		return a+b+c+n;
	}
	
	public int add() {
		return a+b+c;
	}
	

}
