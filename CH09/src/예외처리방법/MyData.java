package ����ó�����;

public class MyData {
	int a,b;
	MyData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int div() {
		try {
			return a/b;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("���� �߻�");
			return 0;
		} finally {//������ �ְ� ���� ������ ������ �Ǿ�� �ϴ¹� , ���� return ���� �־ ������ �ȴ�.
			System.out.println("aaaaa");
		}
	}

}
