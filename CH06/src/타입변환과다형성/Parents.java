package 타입변환과다형성;

public class Parents {
	String w;
	
	Parents(String w) {
		this.w = w;
	}
	
	void print() {
		System.out.println("부모클래스 내용 : "+ w);
	}
}
