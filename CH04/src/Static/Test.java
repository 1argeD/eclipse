package Static;

public class Test {
	public static void main(String[] args) {
		System.out.println(A.sum(7, 8));
		
		A obj1 = new A();
		obj1.a = 4;
		obj1.b = 4;
		
		
		A obj2 = new A();
		obj2.a = 6;
		obj2.b = 6;
		//static�� ��ü���� ���� ���� �����ؾ� �� �� ���, Ȥ ���(3.14 ��)�� ���
		System.out.println("static�� ���� : "+obj1.a+"  "+obj2.a);
		System.out.println("static�� �ƴ� ���� : "+obj1.b+"  "+obj2.b);
	}

}
