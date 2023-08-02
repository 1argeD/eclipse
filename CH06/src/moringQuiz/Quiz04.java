package moringQuiz;

public class Quiz04 {
	public static void main(String[] args) {
		MyClass4 obj1 = new MyClass4();
		MyClass4 obj2 = new MyClass4(1);
		
		obj1.output(); //10À» Ãâ·Â
		int num = obj2.output();
		System.out.println(num);
	}
}
