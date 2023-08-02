package moringQuiz;

public class Quiz05 {
	public static void main(String[] args) {
		MyClass5 obj1 = new MyClass5();
		MyClass5 obj2 = new MyClass5();
		MyClass5 obj3 = new MyClass5(3,4,5);
		
		int sum1 = obj1.out();
		int sum2 = obj2.out();
		int sum3 = obj3.out();
		
		System.out.println(sum1+" "+sum2+" "+sum3);
		
		
	}
}
