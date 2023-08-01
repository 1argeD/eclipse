package Vehicle;

public class Car extends Vehicle{
	String name = "자동차";
	
	void whoami() {
		System.out.println("나는 자동차다");
	}
	
	static void move() {
		System.out.println("이동하다");
	}
}
