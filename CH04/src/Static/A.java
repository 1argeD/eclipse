package Static;


//static ���� - ���� �Ǵ� �޼ҵ� �տ� ���� �� �ִ�.
//static �޸𸮿� �����Ѵ�. -> static�� �տ� ������ ��ü�� �������� �ʾƵ� �̸������� �Ǿ��־� �ڿ��� �����Ѵ�

public class A {
	int a;
	int b;
	final int c = 7;//���, ������ ���� ����ϰ� ������ ���. (���� �Ұ�)  
	//�Ϲ������� final static ������ ����.
	
	//static�� ��ü���� ���� ���� �����ؾ� �� �� ���, Ȥ ���(3.14 ��)�� ���
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	int a() {
		return 4;
	}
	
	void b() {
		a();
	}

}
