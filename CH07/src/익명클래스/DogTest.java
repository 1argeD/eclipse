package 익명클래스;

public class DogTest {
	public static void main(String[] args) {
		Dog poodle = new Dog() {//인터페이스를 통한 익명클래스 구현
			@Override
			public void move() {
				System.out.println("푸들이 걸어간다");
			}
		};
	}
}
