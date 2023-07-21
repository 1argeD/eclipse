package Static;

public class MainTest {
	public static void main(String[] args) {
		a();
	}
	//객체마다 만들어지는 것이 아닌 하나만 존재하기 위해서 static을 붙힌다.
	static int a() {
		return 5;
	}
}
