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
		//static은 객체끼리 같은 값을 공유해야 할 떄 사용, 혹 상수(3.14 등)에 사용
		System.out.println("static인 변수 : "+obj1.a+"  "+obj2.a);
		System.out.println("static이 아닌 변수 : "+obj1.b+"  "+obj2.b);
	}

}
