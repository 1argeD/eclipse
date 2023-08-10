package 추상클래스;

public class ShapeTest {
	public static void main(String[] args) {
		//Shape sh = new Shape(); - Shape가 추상 메소드 이기 때문에 직접 선언해서 사용 불가 
		
		Circle ci = new Circle();
		ci.draw(); // Shape의 draw()를 상속받아서 사용가능 
	}
}
