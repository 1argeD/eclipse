package ���ܴ�����;

public class Quiz01 {
	public static void main(String[] args) {
		MyClass1 obj = new MyClass1();
		int result;
		try {
			result = obj.div(10,0);
		}catch(Exception e) {
			result = 0;
		}
		System.out.println("�����"+result);
		//0���� ����� ����� 0���� ������ �����
	
	}
}
