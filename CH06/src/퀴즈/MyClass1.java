package ДыБо;

public class MyClass1 implements InterMyClass1 {
	int a,b;
		
	MyClass1(int a, int b) {
		this.a = a;
		this.b = b;
	}	
	
	@Override
	public int add() {
		return a+b;
	}

	@Override
	public int sub() {
		return a-b;
	}

	@Override
	public int allAdd() {
		int sum=0;
		for(  ; a<=b; a++) sum+=a;
		return sum;
	}

}
