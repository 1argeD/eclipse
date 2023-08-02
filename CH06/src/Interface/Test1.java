package Interface;

public class Test1 {
	public static void main(String[] args) {
		MyClass1_1 obj = new MyClass1_1(1,2);
		MyClass2 obj2 = new MyClass2();
		obj2.out(obj); /*원래라면 MyClass2 내부에 있는 함수가 받는 값을 MyClass1가 바뀌면 
		받아 오는 값을 바뀐 클래스를 따라서 바꿔줘야하는데, 인터페이스를 통해서 받아오면 내부 코드가 변경되어도 인터페이스에 받아오면
		값을 바꿔 주지 않아도 된다(MyClass2 out()코드참조)
		*/
		int num1 = obj.add();
		int num2 = obj.sub();
	
		
		InterMyClass1 InterfacePrants = new MyClass1(2,3);
		int num3 = InterfacePrants.add();
		
		System.out.println(num1+" "+num2+" "+num3+" ");
		
	}
}
