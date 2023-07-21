package 객체복습;

public class MainTest {

	public static void main(String[] args) {
		// 자바는 main 메소드에서 시작해서 끝
		
		Square sq1 = new Square(7, 10);
		System.out.println(sq1.round());
		System.out.println(sq1.area());
		
		Square2 sq2 = new Square2(3, 5);
		System.out.println(sq2.area());
		System.out.println(sq2.round());
	}

}
