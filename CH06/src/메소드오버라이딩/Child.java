package 메소드오버라이딩;

public class Child extends Parents{
	
	//메소드 오버라이딩 (자식클래스에서 부모 클래스의 메소드를 재정의하여 사용하는 것)
	@Override // 어노테이션(Annotation) 메소드 오버라이딩을 하지 않을 시 틀렸다고 확인시켜줌. 컴파일러에게 해당 내용 지시
	void print() {
		System.out.println(num*11);
	}
}
