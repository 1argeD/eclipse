package Vehicle;

public class OverTypeDemo {
 public static void main(String[] args) {
	 Vehicle v = new Car();
	 System.out.println(v.name); //부모로 부터 받아온 값이기에 자식클래스의 String 값을 가져오지 않음.
	 
	 v.whoami();//static으로 선언한 것이 아니기 때문에 값이 자식의 다형성을 적용시킨다. 
	 v.move();//부모로 부터 받은 static 매서드를 사용했기 떄문에 값이 변하지 않는다.
 }
}
