package Ÿ�Ժ�ȯ��������;

public class Child extends Parents {
	
	Child(String w) {
		super(w);	
	}
	
	@Override//�������̵��� ���� ��� �ڽ��� �޼ҵ带 ����Ѵ� (������)
	void print() {
		System.out.println(w);
	}
	
	void print2() {
		System.out.println("�ڽ� ���� " + w);
	}
}
