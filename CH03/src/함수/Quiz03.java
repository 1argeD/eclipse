package �Լ�;

import java.util.Random;

public class Quiz03 {

	public static void main(String[] args) {
		
		System.out.println(myRandom());
			//�ڹٴ� �޼ҵ� �Ķ������ Ÿ�԰� ������ ������ ������ �� �ִ�.- �޼ҵ尡 ���� ���ɽ� ���� �̸� ���
			//�޼ҵ�����ε�(method overloading)
	}
	
	private static int myRandom() {
		Random rd = new Random(); 
		return rd.nextInt(10)+1; 
	}
	
	private static int myRandom(int a) {
		return 0;
	}
	
	private static int myRandom(double a) {
		return 0;
	}

}
