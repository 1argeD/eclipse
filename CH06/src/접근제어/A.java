package 접근제어;

public class A {
	 public int PUBLIC; //퍼블릭은 공개, 당연히 상속 가능
	 protected int PROTECTED;//protected default + 상속 받은 자기 자식클래스만 사용이 가능하다  
	 int DEFAULT;  //default은 같은 패키지에서만 사용가능. 
	 private int PRIVATE;//private는 자기 클래스에서만 사용가능.
}
