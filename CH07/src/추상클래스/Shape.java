package 추상클래스;

//추상클래스 - 객체를 못 만든다 (인스턴스를 생성하지 못한다.) - 상속으로 자식클래스를 만들때 사용한다.
abstract public class Shape {
	double pi = 3.14;
	
	//추상클래스는 일반적으로 추상메소드를 포함한다.
	abstract void draw();//이렇게 생성된 메소드는 상속받은 클래스에서만 구현이 가능하다.
	
}
