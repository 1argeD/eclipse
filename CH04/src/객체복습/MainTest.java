package ��ü����;

public class MainTest {

	public static void main(String[] args) {
		// �ڹٴ� main �޼ҵ忡�� �����ؼ� ��
		
		Square sq1 = new Square(7, 10);
		System.out.println(sq1.round());
		System.out.println(sq1.area());
		
		Square2 sq2 = new Square2(3, 5);
		System.out.println(sq2.area());
		System.out.println(sq2.round());
	}

}
