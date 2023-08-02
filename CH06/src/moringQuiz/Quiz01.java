package moringQuiz;

public class Quiz01 {
	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1();
		MyClass1 obj2 = new MyClass1(3,20);
		
		int num1 = obj1.alladd();//1부터 10까지
		int num2 = obj2.alladd(5, 9);
		int num3 = obj2.alladd(); //생성자로 초기화한 값 3~20 까지 모두 더한 값
		
		System.out.println("num1은 "+ num1 +" num2는 " + num2+" num3은 "+ num3);
	} 

}
