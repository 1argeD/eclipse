package 객체복습;

//record 클래스는 상속이 불가능함!

public record MyMath2Record(
		int a, int b, int c
		) {
	void sum() {
		System.out.println(a+b+c); 
	}
}
