package �޼ҵ�������̵�;

public class Child extends Parents{
	
	//�޼ҵ� �������̵� (�ڽ�Ŭ�������� �θ� Ŭ������ �޼ҵ带 �������Ͽ� ����ϴ� ��)
	@Override // ������̼�(Annotation) �޼ҵ� �������̵��� ���� ���� �� Ʋ�ȴٰ� Ȯ�ν�����. �����Ϸ����� �ش� ���� ����
	void print() {
		System.out.println(num*11);
	}
}
