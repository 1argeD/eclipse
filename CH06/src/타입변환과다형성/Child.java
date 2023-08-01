package 타입변환과다형성;

public class Child extends Parents {
	
	Child(String w) {
		super(w);	
	}
	
	@Override//오버라이딩을 했을 경우 자식의 메소드를 출력한다 (다형성)
	void print() {
		System.out.println(w);
	}
	
	void print2() {
		System.out.println("자식 내용 " + w);
	}
}
