package 객체복습;
//접근제한자 종류 4가지 public, 생략(default), private, protect
//               (공개), 같은 패키지에서만, private 유사 - 상속시에는 사용가능, 자기자신만 사용가능
//클래스는 public과 default만 사용가능.


public class Square {
	
	//클래스의 3가지 구성요소
	//필드(맴버변수, 전역변수), 메소드(함수), 생성자
	//생성자(기본 생성자는 생략 가능 - 단, 생성자를 만들면 기본생성자를 자동으로 안 만듦)
	
	private int width, height;
	
	//생성자
	Square(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	int area() {
		return height*width;
	}
	
	int round() {
		return (height+width)*2;
	}

}
