package p313;

public class ObjectTest {
	public static void main(String[] args) {
		MyClass obj = new MyClass(7);
		MyClass obj1 = new MyClass(7);
		
		
		if(obj == obj1) {//값이 아니라 주소값을 비교하는 문법이기 때문에 다르다가 반환된다. String값을 비교하기 위해선 equlas()메소드를 사용한다.
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(obj.equals(obj1)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
		System.out.println(obj);
		
		
		
	}

}
