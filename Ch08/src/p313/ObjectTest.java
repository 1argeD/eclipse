package p313;

public class ObjectTest {
	public static void main(String[] args) {
		MyClass obj = new MyClass(7);
		MyClass obj1 = new MyClass(7);
		
		
		if(obj == obj1) {//���� �ƴ϶� �ּҰ��� ���ϴ� �����̱� ������ �ٸ��ٰ� ��ȯ�ȴ�. String���� ���ϱ� ���ؼ� equlas()�޼ҵ带 ����Ѵ�.
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		if(obj.equals(obj1)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		
		System.out.println(obj);
		
		
		
	}

}
