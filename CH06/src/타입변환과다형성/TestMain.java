package Ÿ�Ժ�ȯ��������;

public class TestMain {

	public static void main(String[] args) {
		Parents p = new Parents("aaa");
		p.print();
		
		test1(p);//�ڽİ� �θ�ü�� ������ �θ� ���� �� �ִ�..
		
		Child c = new Child("bbb");
		c.print();
		c.print2();
	
		////////////////////////////////////////////////////////////////////////////////
		
		Parents p2 = new Child("ccc");
		p2.print(); //�θ�� ���� �޾ұ� ������ �ڽĿ� �ִ� print2()�� ����� �� ����.
		
		((Child)p2).print2();//����ȯ - �ٲ� �� �ִ� ��쿡�� ���� ��ȯ��Ų��.(����) 
		
		Child c1 = (Child)p2;
		c1.print2();
		
		
	}
	
	static void test1(Parents p) {
		
	}

}
