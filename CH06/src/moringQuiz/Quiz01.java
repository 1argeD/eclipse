package moringQuiz;

public class Quiz01 {
	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1();
		MyClass1 obj2 = new MyClass1(3,20);
		
		int num1 = obj1.alladd();//1���� 10����
		int num2 = obj2.alladd(5, 9);
		int num3 = obj2.alladd(); //�����ڷ� �ʱ�ȭ�� �� 3~20 ���� ��� ���� ��
		
		System.out.println("num1�� "+ num1 +" num2�� " + num2+" num3�� "+ num3);
	} 

}
