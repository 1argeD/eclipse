package Interface;

public class Test1 {
	public static void main(String[] args) {
		MyClass1_1 obj = new MyClass1_1(1,2);
		MyClass2 obj2 = new MyClass2();
		obj2.out(obj); /*������� MyClass2 ���ο� �ִ� �Լ��� �޴� ���� MyClass1�� �ٲ�� 
		�޾� ���� ���� �ٲ� Ŭ������ ���� �ٲ�����ϴµ�, �������̽��� ���ؼ� �޾ƿ��� ���� �ڵ尡 ����Ǿ �������̽��� �޾ƿ���
		���� �ٲ� ���� �ʾƵ� �ȴ�(MyClass2 out()�ڵ�����)
		*/
		int num1 = obj.add();
		int num2 = obj.sub();
	
		
		InterMyClass1 InterfacePrants = new MyClass1(2,3);
		int num3 = InterfacePrants.add();
		
		System.out.println(num1+" "+num2+" "+num3+" ");
		
	}
}
