package ���ٽĹ���;

interface N {
	int neg(int x);
}

public class Lambda2Demo {
	public static void main(String[] args) {
		N n;
		
		n = (int x) -> {return -x;};//�⺻ǥ���
		n = (int x) -> -x;
		n = (x) -> {return -x;}; //����� Ÿ�� ��������
		n = x -> {return -x;};	//�ŰԺ����� �ϳ��� ��� ��ȣ ��������
		n = x -> -x;	    	//���๮�� �ϳ���� �߰�ȣ�� �����ݷ� ��������(��, ���๮�� �ϳ��� return���̶�� )
								//return Ű���嵵 ��������
		
	}
	
	
//	int neg(int x) {
//		return -x;
//	}
	
}
