package Interface;

public class MyClass1_1 implements InterMyClass1 {

	int a,b;
	
	
	MyClass1_1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	@Override
	public int add() {
		//�����ڵ� ���� 
		return a+b;
	}

	@Override
	public int sub() {
		//�����ڵ� ���� 
		return a-b;
	}
	

}
