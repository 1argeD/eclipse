package 객체복습;

//record 클래스는 상속이 불가능함!

public record MyMathRecord(
		
		int num1, int num2
		
		) {
	
	int allsum() {
		int i = num1;
		int sum =0;
		
		for( ; i<=num2; i++) sum += i;
		
		return sum;
	}
	
	int mul() {
		return num1*num2;
	}
	
	int max(int a, int b) {
		//return a>b ? a:b;
		return Math.max(a, b);
	}
	
}
