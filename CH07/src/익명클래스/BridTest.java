package 익명클래스;

public class BridTest {
	public static void main(String[] args) {
		Bird b = new Bird() {//상속을 통한 익명 클래스 구현 
			void move() {
				System.out.println("독수리가 날아간다");
			}
			
			void eat() {//외부에서 사용 불가 - 부모클래스의 객체임.
				System.out.println("먹자");
			}
		};
		
		b.move();
		
	}
}
