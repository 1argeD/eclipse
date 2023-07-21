package °´Ã¼º¹½À;

public class Quiz01 {
	public static void main(String[] args) {
		MyMathClass obj = new MyMathClass();
		obj.num1=1;
		obj.num2=10;
		int sumClass = obj.allsum();
		System.out.println(sumClass);
		int mulClass = obj.mul();
		System.out.println(mulClass);
		
		MyMathClass obj2 = new MyMathClass(1,100);
		System.out.println(obj2.allsum());
		System.out.println(obj2.mul());
		System.out.println(obj2.max(3, 7));
		
		MyMathRecord objEx = new MyMathRecord(1, 10);
		System.out.println(objEx.allsum());
		System.out.println(objEx.mul());
		System.out.println(objEx.max(3, 7));
		
	}

}
